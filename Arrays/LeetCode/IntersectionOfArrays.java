import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays
{
        public static int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<nums1.length;i++)
            {
                for(int j=0;j<nums2.length;j++)
                {
                    if(nums1[i]==nums2[j])
                        set.add(nums1[i]);
                }
            }
            int[] result = new int[set.size()];
            int i = 0;
            for (int num : set) {
                result[i++] = num;
            }
            return result;
        }
    public static void main(String[] args)
    {
        int[] arr1={1,6,3,7,5};
        int[] arr2={1,2,3,4,5};
        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }
}
