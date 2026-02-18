public class CountGreater {
    public static void main(String[] args) {
        int arr[] = {2,5,1,8,3};
        int x = 3;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("count = "+ count);
    }
    
}
