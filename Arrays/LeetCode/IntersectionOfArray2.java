import java.util.*;
public class IntersectionOfArray2
{
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        boolean[] used = new boolean[nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !used[j]) {
                    resultList.add(nums1[i]);
                    used[j] = true;
                    break;
                }
            }
        }

        int[] result = new int[resultList.size()];
        int idx = 0;
        for (int num : resultList) {
            result[idx++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 2, 5};
        int[] arr2 = {1, 2, 3, 2, 5};
        System.out.println(Arrays.toString(intersect(arr1,arr2)));
    }
}
