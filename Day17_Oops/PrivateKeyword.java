//package Day17_Oops;

class Students {
    String name; // null
    private int rno; // 0
    double cgpa; // 0.0

}

public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.cgpa);
        s1.name = "Abhi";
        s1.cgpa = 8.9;
        //s1.rno =101;

        System.out.println(s1.name);

    }
}
