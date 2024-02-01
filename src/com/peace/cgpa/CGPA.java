package com.peace.cgpa;

import java.util.Scanner;

public class CGPA {
    public static void main(String[]args) {
        //this statement calls the method calculatecgpa
        calculategpa();
    }
    public static double calculategpa() {
        //initializing and iterating the varables
        int num;
        int totalunitload;
        double totalpoint;
        int unitload;
        char peace;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of courses: ");
        num = input.nextInt();
        //initialize variables to zero
        totalunitload = 0;
        totalpoint = 0;

//
        for (int i = 1; i <= num; i++) {
            System.out.println("\n Enter details of the courses choosen" + i + ":");
            String courses = input.next();
            input.nextLine();
            System.out.println("Enter the unitload for " + courses + " :");
            unitload = input.nextInt();

            System.out.println("Enter grade for the " + courses + " (A, B, C, D, E, F):");
            peace = input.next().toUpperCase().charAt(0);

            double gradepoint = calculategradepoint(peace);
            double course = gradepoint * unitload;
            totalunitload = totalunitload + unitload;
            totalpoint += course;
        }
        double cgpa = totalpoint / totalunitload;
        System.out.println("The total cgpa: " + cgpa);
        checkClass(cgpa);
        return cgpa;
    }
    public static String checkClass(double cgpa){
        String msg = "";

        //program to check the class
        if (cgpa >= 4.5 && cgpa <= 5.0) {
            msg = "congratulation you are a first class graduate:";
            System.out.println(msg);
            return msg;
        } else if (cgpa >= 3.5 && cgpa <= 4.49) {
            msg = "congratulation you are a second class upper graduate:";
            System.out.println(msg);
           return msg;
        } else if (cgpa >= 2.5 && cgpa <= 3.39) {
            msg = "congratulation you are a second class lower graduate:";
            System.out.println(msg);
            return msg;
        } else if (cgpa >= 1.5 && cgpa <= 2.49) {
            msg = "Thanks for stopping by and its a pass mark :";
            System.out.println(msg);
            return msg;
        } else {
             msg = "Thanks for attending school, go and fry akara";
            System.out.println(msg);
            return msg;

        }


    }
        private static double calculategradepoint(char grade){
        switch (grade){
            case 'A':
                return 5.0;
            case 'B':
                return 4.0;
            case 'C':
                return 3.0;
            case 'D':
                return 2.0;
            case 'E':
                return 1.0;
            case 'F':
                return 0.0;
            default:
                System.out.println("YOU FAILED");
                return 0.0;
        }


    }
}
