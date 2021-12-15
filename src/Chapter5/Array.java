package Chapter5;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter element at index" + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Arr elements re : ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
