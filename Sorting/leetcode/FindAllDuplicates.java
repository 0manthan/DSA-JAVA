import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> ans=new ArrayList<>();
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
                ans.add(nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,3};
        System.out.println(findDuplicates(arr));
    }
}
