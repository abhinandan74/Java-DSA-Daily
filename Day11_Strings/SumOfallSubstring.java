//package Day11_Strings;

public class SumOfallSubstring {
    public static void main(String[] args) {
        String s = "6759";
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                sum += Integer.parseInt(sub);
            }

        }
        System.out.println(sum);
    }
}
