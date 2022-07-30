package Test;

import java.util.Scanner;

public class Recursion {
    public static int fabonacciN(int i,int current,int sum) {
        if (i == 0) {
            return 1;
        }
        System.out.print(" "+current);
        sum+=current;
        fabonacciN(i-1,sum, current); //passing value of sum in current and current value to sum
        return 1;
    }
    public static void main(String [] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Press 1 for fabonacci numbers");
        System.out.println("Press 0 to exit");
        int number = input.nextInt();
        switch (number) {
            case 0:
                return; //exit
            case 1:
                System.out.print("For how many numbers?");
                int i=input.nextInt();
                fabonacciN(i, 0, 1);
        }
    }

}
