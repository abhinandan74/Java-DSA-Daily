//package Day07_Arrays;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 5};
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum element is: " + min);
    }
}
