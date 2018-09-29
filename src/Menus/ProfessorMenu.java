package Menus;

import Storage.GroupsCreated;

import java.util.Scanner;

public class ProfessorMenu {
    public void show() {
        System.out.println("Please, choose group to check presence:  1 for BIOLOGY; 2 for CHEMISTRY");
        boolean f = true;
        do {


            Scanner scan = new Scanner(System.in);

            int num = scan.nextInt();
            switch (num) {
                case 1:
                    new GroupsCreated().check(new GroupsCreated().create1());
                    System.exit(0);

                case 2:
                    new GroupsCreated().check(new GroupsCreated().create2());

                    System.exit(0);
                default:
                    System.out.println("Incorrect number. Please, enter a correct one.");
                    f = true;
            }
        }
        while (f == true) ;

    }
}
