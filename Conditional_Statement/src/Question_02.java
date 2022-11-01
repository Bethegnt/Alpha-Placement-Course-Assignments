/*
code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever.
 */

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the temp: ");
        double temp = sc.nextInt();
        if(temp>100){
            System.out.println("you have a fever");
        }else {
            System.out.println("you dont have a fever");
        }
        System.out.println();
    }
}
