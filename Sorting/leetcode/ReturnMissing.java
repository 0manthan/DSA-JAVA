public class ReturnMissing {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,0};
        int m=cyclicsort(arr);
        System.out.println(m);
    }
    static int cyclicsort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int index=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[index]){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
            else
                i++;
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i)
                 return i;
        }
        return arr.length;
    }

}
