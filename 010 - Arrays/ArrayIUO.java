import java.util.Scanner;

public class ArrayIUO {
    public static void main(String args[]){
        int marks[] = new int[3];
        Scanner obj = new Scanner(System.in);
        marks[0] = obj.nextInt();
        marks[1] = obj.nextInt();
        marks[2] = obj.nextInt();
        System.out.println("Marks in Physics : "+marks[0]);
        System.out.println("Marks in Maths : "+marks[1]);
        System.out.println("Marks in Computer : "+marks[2]);

        marks[1] = marks[1] + 10;
        System.out.println("Updated marks in Maths : "+marks[1]);

        System.out.println(marks.length);
    }
}
