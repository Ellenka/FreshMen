package Menus;


import Storage.GroupsCreated;
import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class StudentMenu {
    public boolean f = true;
    public void show() {
        System.out.println("Would you like to choose a Group leader?");
        System.out.println("Press Y for yes and N for no");


        boolean f1 = true;
        do {


            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            if (ch == 'n' || ch == 'N')
                System.exit(0);
            else
            if(ch == 'y' || ch == 'Y') {

                System.out.println("Please, choose your group:  1 for BIOLOGY; 2 for CHEMISTRY");


                do {


                    Scanner scan = new Scanner(System.in);

                    int num = scan.nextInt();
                    switch (num) {
                        case 1:
                            new GroupsCreated().print(new GroupsCreated().create1());
                            System.out.println("Your leader is the one with highest GPA and problem-solving skills+");
                            new GroupsCreated().choose(new GroupsCreated().create1());
                            System.exit(0);

                        case 2:
                            new GroupsCreated().print(new GroupsCreated().create2());
                            System.out.println("Your leader is the one with highest GPA and problem-solving skills+");
                            new GroupsCreated().choose(new GroupsCreated().create2());
                            System.exit(0);
                        default:
                            System.out.println("Incorrect number. Please, enter a correct one.");
                            f = true;
                    }
                }
                while (f == true) ;


            }
            else
            {
                System.out.println("Wrong answer.  Please enter a correct one");
                f1 = true;
            }

        }
        while (f1 = true);




}

}
