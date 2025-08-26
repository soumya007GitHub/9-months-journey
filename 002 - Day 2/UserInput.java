import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Your course name: ");
        String course = obj.next();
        System.out.print("\nYour age: ");
        int age = obj.nextInt();
        System.out.print("\nYour full name: ");
        String name = obj.nextLine();
        System.out.println("Your expected salary: ");
        double salary = obj.nextDouble();

        System.out.println("The details are:\nCourse: " + course + "\nName: " + name + "\nAge: " + age);
        obj.close();
    }
}