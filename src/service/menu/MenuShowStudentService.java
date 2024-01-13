package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {

    @Override
    public void process() {
        Student[] students = Config.getInstance().getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
