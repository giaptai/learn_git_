public class aaa {

    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length, mid = (start + end) / 2;
        while (start != end) {
            if (mid >= target) {
                start = mid;
            } else {
                end = mid;
            }
            

        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(searchInsert(nums, target));

    }

}
