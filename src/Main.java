import model.*;


public class Main {
    public static void main(String[] args) {

        CourseClass class205D = new CourseClass(9, 50, 'D');
        System.out.println(class205D.toString());

        Major csci = new Major("Computer Science", 220);
        Major phar = new Major("Pharmacy", 340);

    }
}