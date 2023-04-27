/**
 * @author fazliberkordek
 */

import java.util.Scanner;

//This program calculates the factorial:
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, total = 1;
        //Taking a number from user:
        System.out.print("Please enter a number:");
        num = input.nextInt();
        //Finding the factorial:
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        System.out.println("Factorial : " + total);

        //While :
        int a, total2 = 1, counter = 1;
        System.out.print("please enter a number:");
        a = input.nextInt();
        while (counter <= a) {
            total2 *= counter;
            counter++;
        }
        System.out.println("Factorial is : " + total2);

        //Do-While :
        int numero, total3 = 1, counters = 1;
        System.out.print("please enter a number:");
        numero = input.nextInt();

        do {
            total3 *= counters;
            counters++;
        } while (counters <= numero);
        System.out.println("Factorial :" + total3);
    }

}
