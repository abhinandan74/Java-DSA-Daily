//package Day05_Araay;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {5,6,8,7,90,85,2,3};
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max in array is: "+ max);
    }
}
