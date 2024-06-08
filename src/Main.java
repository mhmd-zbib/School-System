import model.Course;
import model.Major;
import model.Student;
import model.User;
import usermanagement.StudentManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final StudentManager studentManager = new StudentManager();


    public static void main(String[] args) {


        Major csci = new Major("Computer Science", 220);
        Major art = new Major("Art", 150);

        Course painting = new Course("Painting", "PAI100", 3);
        Course modeling = new Course("Modeling", "MODE100", 4);
        Course java1 = new Course("Java", "JAVA100", 3);
        Course java1Lab = new Course("Java Lab", "JAVA100", 1);
        Course linearAlgebra = new Course("Linear Algebra", "LINEAR100", 3);

        Student moe = new Student("Mohammad", "mohammad@gmail.com", "zahraa123");


        art.addCourse(modeling);
        art.addCourse(painting);


        csci.addCourse(java1);
        csci.addCourse(java1Lab);
        csci.addCourse(linearAlgebra);


        moe.setMajor(csci);

        System.out.println(csci.getStudents());





        for (Course course : csci.getCourses()) {
            System.out.println(course.getName());
        }

        for (Major major : painting.getMajors()) {
            System.out.println("The majors i am with: " + major.getName());





        }


        for (Student stundet :  csci.getStudents()) {
            System.out.println("The majors i am with: " + stundet.getName());

        }



//        boolean running = true;
//
//        while (running) {
//            System.out.println("Welcome to the School Management System\nPlease select an option:\n 1. Login\n 2. Signup\n 0. Exit");
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 1:
//                    break;
//                case 2:
//                    signupUser();
//                    break;
//                case 0:
//                    running = false;
//                    break;
//                default:
//                    System.out.println("Invalid option");
//            }
//        }
//        scanner.close();
    }


//    public static void signupUser() {
//        System.out.println("Please enter your username: ");
//        String username = scanner.nextLine();
//
//
//        System.out.println("Please enter your email: ");
//        String email = scanner.nextLine();
//
//        System.out.println("Please enter your password  (eg: Passw0rd!): ");
//        String password = scanner.nextLine();
//
//        try {
//            studentManager.signup(username, email, password);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }

}