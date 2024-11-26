import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the co-ordinates of y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter the co-ordinates of x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the co=ordinates of y2: ");
        double y2 = sc.nextDouble();

        double length=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println("The length of the line is: " + length);



    }
}