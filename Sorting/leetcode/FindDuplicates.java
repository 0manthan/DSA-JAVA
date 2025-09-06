public class FindDuplicates {
        public static int findDuplicate(int[] arr) {
            int i=0;
            while(i<arr.length)
            {
                if(arr[i]!=i+1)
                {
                    int index=arr[i]-1;
                    if(arr[i]!=arr[index])
                    {
                        int temp=arr[i];
                        arr[i]=arr[index];
                        arr[index]=temp;
                    }
                    else
                        return arr[i];
                }
                else
                    i++;

            }
            return 0;
        }
        public static void main(String args[])
        {
            int[] arr={1,2,3,1};
            System.out.println(findDuplicate(arr));
        }
}
