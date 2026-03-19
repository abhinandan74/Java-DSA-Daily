//package Day13_Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i;
        for (i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Not Anagram");
                break; // ❗ loop yahin ruk jayega
            }
        }

        // agar pura loop chal gaya (break nahi hua)
        if (i == arr1.length) {
            System.out.println("Anagram");
        }

    }
}
