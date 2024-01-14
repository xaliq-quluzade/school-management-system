package service.menu;

import bean.Config;
import service.menu.inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.print("username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("password:");
        String password = sc2.nextLine();

        if (!(username.equals("admin") && password.equals("admin"))) {
            throw new IllegalArgumentException("username or password is invalid");
        }

        Config.setLoggedIn(true);
    }

}
