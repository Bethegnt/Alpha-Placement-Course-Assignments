import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Price of the pencil: ");
        float Pencil = sc.nextFloat();
        System.out.println("Price of the Pen");
        float Pen  = sc.nextFloat();
        System.out.println("Price of the Eraser");
        float Eraser = sc.nextFloat();
        float sum = Pen+Pencil+Eraser;
        System.out.println("Bill is: "+sum);
        float tax;

        if (sum <= 30){
            tax = 0;
        }else{
            tax=  (int)(sum*0.18);
        }
        float newtotal = sum + tax;
        System.out.println("your tax in price: "+tax);
        System.out.println("total bill with 18% tax is: "+newtotal);
    }
}
