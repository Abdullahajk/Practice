package Test;

import java.util.Scanner;


public class Practice {
    public static void iSort(int [] arr){

    }
    public static void sSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int Smallest =i;
            for(int j=i+1;j<arr.length;j++) {
             if(arr[i]>arr[j]){
                 Smallest =j;
             }
            }
           int temp =arr[Smallest];
            arr[Smallest]=arr[i];
            arr[i]=temp;
        }
        for (int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
    public static void bSort(int [] arr) {

        for(int i=1;i<arr.length;i++)
        {
            for (int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i< 5; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void Convert() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Octa number");
        String str = input.nextLine();
        int firstNumber = Integer.parseInt(str, 8); //converting string to integer
        System.out.println("Enter Second Number");
        String str1 = input.nextLine();
        int secondNumber = Integer.parseInt(str1, 8);
        System.out.println("Binary value of first number=" + Integer.toBinaryString(firstNumber));
        System.out.println("Binary value of second number=" + Integer.toBinaryString(secondNumber));
        System.out.println("Sum=" + Integer.toBinaryString(firstNumber) + Integer.toBinaryString(secondNumber));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input list values");
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++) {
        arr[i]=input.nextInt();
        }
        System.out.println("Press 0 to exit");
        System.out.println("Press 1 to Convert octa to binary and add two numbers");
        System.out.println("Press 2 for bubble sort");
        System.out.println("Press 3 for selection sort");
        int number = input.nextInt();

        switch (number) {
            case 0:
                return; //exit
            case 1:
                Convert();
            case 2:
              bSort(arr);
            case 3:
                sSort(arr);
            case 4:
                iSort(arr);
        }
    }
}
