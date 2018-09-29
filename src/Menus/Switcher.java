package Menus;

import Users.Student;

import java.util.Scanner;

public class Switcher {

     public void choose () {
         Scanner scan = new Scanner(System.in);
         System.out.println("Hello!  Who are you?");
         System.out.println("Please, enter 1, if you are a Student");
         System.out.println("Please, enter 2, if you are a Professor");
         boolean flag = true;

         do {

             int num = scan.nextInt();
             switch (num) {
                 case 1:
                     new StudentMenu().show();
                     break;
                 case 2:
                     new ProfessorMenu().show();
                     break;
                 default:
                     System.out.println("Incorrect number. Please, enter a correct one.");
                     flag = true;
             }
         }
             while (flag == true);
         }
     }

