
class Solution {
    public static void main(String[] args) {

            int[] nums = {12, 345, 2, 6, 7896};
            int count = 0;

            for (int element : nums) {
                int temp = 0;
                while (element > 0) {
                    int digit = element % 10;
                    temp++;
                    element = element / 10;
                }
                if (temp % 2 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }