//package Day05_Araay;

import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        //input
        System.out.println("Enter the array elements :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //output
        System.out.println("The array element are :");
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }        
    }
}
