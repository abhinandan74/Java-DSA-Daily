//package Day06_Arrays;

import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the Array");
        for(int i=0;i<size;i++) a[i]=sc.nextInt();
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(a[i]+a[j]==target) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
