/*
Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side))
 */

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = sc.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println("Area of the circle: "+area);
    }
}
