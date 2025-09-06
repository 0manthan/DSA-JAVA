
import java.util.Arrays;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int index=nums[i]-1;
            if(nums[i]!=nums[index])
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
            else
                i++;
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
                return new int[]{nums[i],i+1};
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,2};
        SetMismatch sm=new SetMismatch();
        System.out.println(Arrays.toString(sm.findErrorNums(arr)));
    }
}
