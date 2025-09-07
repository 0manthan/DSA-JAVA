public class ThirdMaxFromArray
{
    public static int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int n : nums) {
            long num = n; // promote to long to avoid overflow edge cases
            if ((first != null && num == first) ||
                    (second != null && num == second) ||
                    (third != null && num == third)) {
                continue; // skip duplicates
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }

        return (third == null) ? first.intValue() : third.intValue();
    }
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[] {1, 2, 3, 4, 5}));
    }
}
