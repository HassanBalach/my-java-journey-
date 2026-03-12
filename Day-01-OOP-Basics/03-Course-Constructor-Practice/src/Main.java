//First step to import Scanner you JCK ;
//Second step to create object in main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter Course ID");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Enter the course Name?");
        String courseName = input.nextLine();


        System.out.println("Write the course credit hours: ");
        int courseCreditHours = input.nextInt();
        input.nextLine();


        System.out.println("Enter the Instructor Name for this course:");
        String courseInstructor = input.nextLine();



        //Try to print out the outer of the user to check either I am successfully taking the output from the uses:
        /*
        System.out.println("New ID IS: " + id);
        System.out.println("New Course Name: " + courseName);
        System.out.println("Total Credit Hour for this course:" + courseCreditHours);
        System.out.println("Course Instructor: " + courseInstructor );
        */
        //Now it is time to send the data into object

        Course c1 = new Course(id , courseName , courseCreditHours , courseInstructor);
        c1.display();
    }
}