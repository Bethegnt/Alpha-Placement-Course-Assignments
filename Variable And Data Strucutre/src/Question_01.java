/*
Question 1 :  In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)
*/

import java.util.Scanner;
public class Question_01 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print letter A: ");
        int a = sc.nextInt();
        System.out.println("Print letter B: ");
        int b = sc.nextInt();
        System.out.println("Print letter C: ");
        int c = sc.nextInt();
        float avg = a+b+c/3;
        System.out.println("Average of the all digits: "+avg);

    }

}
