package util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu() {
        System.out.println("Please selected menu");

        Menu.show();

        Scanner sc = new Scanner(System.in);
        int selectedMenu = sc.nextInt();

        Menu m = Menu.find(selectedMenu);
        m.process();
    }
}
