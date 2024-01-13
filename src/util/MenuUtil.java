package util;

import java.util.Scanner;

public class MenuUtil {
    public static Menu showMenu() {
        System.out.println("Please selected menu");

        Menu.show();

        Scanner sc = new Scanner(System.in);
        int selectedMenu = sc.nextInt();

        return Menu.find(selectedMenu);
    }

    public static void processMenu(Menu menu) {
        menu.process();
    }
}
