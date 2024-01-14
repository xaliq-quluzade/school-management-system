package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("surname:");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();

        t.setName(name);
        t.setSurname(surname);

        Config.getInstance().appendTeacher(t);
        System.out.println("student added");
    }
}
