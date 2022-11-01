/*
Question 1 :  Write a Java program to get a number from the user and print whether it is
positive or negative.
*/

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Its Positive number");
        }else {
            System.out.println("its negative number");
        }
        System.out.println();
    }
}
