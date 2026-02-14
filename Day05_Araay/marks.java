//package Day05_Araay;

public class marks {
    public static void main(String[] args) {
        int[] arr = {100,95,85,21,17,71,36,35,7};
        for(int i=0; i < arr.length; i++){
            if(arr[i] < 30){
                System.out.print(i + " ");
            }
        }

    }
}
