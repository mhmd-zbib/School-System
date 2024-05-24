import model.Course;
import model.Major;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, String> users = new HashMap<>();

    public static void main(String[] args) {


        boolean running = true;


        while (running) {

            System.out.println("Welcome to the School Management System");
            System.out.println("Please select an option:"
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    signup();
                    break;
                case 3:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option");
            }


        }

        scanner.close();
    }


    private static void login() {

    }

    private static void signup() {
    }

}