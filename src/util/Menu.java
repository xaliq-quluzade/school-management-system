package util;

import bean.Config;
import service.menu.*;
import service.menu.inter.MenuService;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add student", new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5, "Show all teacher", new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6, "Show all student", new MenuShowStudentService()),
    UNKNOWN;

    private String label;
    private MenuService service;
    private int number;

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    Menu() {
    }

    public static Menu find(int number) {
        Menu[] menuItems = Menu.values();

        for (int i = 0; i < menuItems.length; i++) {
            if (menuItems[i].getNumber() == number) {
                return menuItems[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void show() {
        Menu[] menuItems = Menu.values();
        for (int i = 0; i < menuItems.length; i++) {
            if (menuItems[i] != UNKNOWN) {
                if ((menuItems[i] == LOGIN || menuItems[i] == REGISTER)) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menuItems[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menuItems[i]);
                }
            }
        }
    }

    public String getLabel() {
        return this.label;
    }

    public String toString() {
        return number + "." + label;
    }

    public void process() {
        service.process();

        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }
}
