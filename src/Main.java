import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of Line1 x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the co-ordinates of Line1 y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter the co-ordinates of Line1 x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the co=ordinates of Line1 y2: ");
        double y2 = sc.nextDouble();

        double length1=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        System.out.println("The length of the line is: " + length1);


        System.out.println("Enter the co-ordinates of Line2 x3: ");
        double x3=sc.nextDouble();
        System.out.println("Enter the co-ordinates of Line2 y3: ");
        double y3=sc.nextDouble();

        System.out.println("Enter the co-ordinates of Line2 x4: ");
        double x4=sc.nextDouble();
        System.out.println("Enter the co-ordinates of Line2 y4: ");
        double y4= sc.nextDouble();

        double length2=Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
        System.out.println("The length of the line is: "+length2);

        if(Double.valueOf(length1).equals(length2)) {
            System.out.println("Two lines are equal in length");
        }else {
            System.out.println("Two lines are not equal in length");
        }
        sc.close();
        }
        }
