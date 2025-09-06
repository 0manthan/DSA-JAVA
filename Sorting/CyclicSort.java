import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr) {
        int j=0;
        while(j<arr.length-1){
            int index=arr[j]-1;
            if(arr[j]!=arr[index]){
                int temp=arr[j];
                arr[j]=arr[index];
                arr[index]=temp;
            }
            j++;
        }
    }
}
