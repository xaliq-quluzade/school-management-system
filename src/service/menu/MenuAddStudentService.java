package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("name:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("surname:");
        String surname = sc2.nextLine();

        Student s = new Student();

        s.setName(name);
        s.setSurname(surname);

        Config.getInstance().appendStudent(s);
        System.out.println("student added");

        Config.save();
    }
}
