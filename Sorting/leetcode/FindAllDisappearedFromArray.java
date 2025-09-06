import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedFromArray {
        public static List<Integer> findDisappearedNumbers(int[] nums)
        {
            int i=0;
            while(i<nums.length)
            {
                int index=nums[i]-1;
                if(nums[i]!=nums[index])
                {
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                }
                else
                    i++;
            }
            List<Integer> ans=new ArrayList<>();
            for(i=0;i<nums.length;i++){
                if(nums[i]!=i+1)
                    ans.add(i+1);
            }
            return ans;
        }
        public static void main(String[] args)
        {
            int[] arr={4,3,2,7,8,2,3,1};
            System.out.println(findDisappearedNumbers(arr));
        }
}
