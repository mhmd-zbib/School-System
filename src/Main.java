import model.Course;
import model.Major;
import model.Student;
import usermanagement.StudentManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the School Management System\nPlease select an option:\n 1. Login\n 2. Signup\n 0. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    signupUser();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        scanner.close();
    }


    public static void signupUser() {
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Please enter your email: ");
        String email = scanner.nextLine();

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        try {
            studentManager.signup(username, email, password);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

}