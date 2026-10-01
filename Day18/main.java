
//package Day18;
import java.util.*;
// import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // int n = 3;
        
        // for(int row = 1; row<=n; row++){
        //     for(int col=1; col<= 5; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();

        // }

        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");

        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i<=n; i++){

        //     for(int j =1; j<= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=n; j++){
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i =1; i<=n; i++){
        //     for(int j =1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=i-1; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=2*n-2*i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.add(10);
        // System.out.println(ll);
        // ll.addFirst(1);
        // System.out.println(ll);
        // ll.addLast(201);
        // System.out.println(ll.peek());
        // System.out.println(ll);

        // System.out.println("Before: " + ll);
        // System.out.println("polling:" + ll.poll());
        // System.out.println("After:" + ll);
        // ll.offer(20);
        // System.out.println(ll);

        //stack
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);
        st.push(11);
        System.out.println(st);
        st.push(12);
        System.out.println(st);
        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.search(11));

        System.out.println(st.empty());



    }

}
