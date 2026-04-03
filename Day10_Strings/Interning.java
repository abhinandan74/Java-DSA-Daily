public class Interning {
    public static void main(String[] args) {
        String s = "Hello"; // -> Heylo // index 2
        // String x = "Hello";
        // x = "mello";
        // System.out.println(x);
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);

    }

}
