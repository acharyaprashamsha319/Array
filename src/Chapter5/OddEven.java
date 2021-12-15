package Chapter5;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of na array :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter element at index" + i + " : ");
            arr[i] = sc.nextInt();
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0)
                even = even+1;
            else
                odd++;

        }
        System.out.println("Even nos are" +even);
        System.out.println("odd nos are" +odd);
        }
    }

