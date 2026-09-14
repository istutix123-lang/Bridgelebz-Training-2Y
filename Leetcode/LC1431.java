import java.util.Arrays;

public class LC1431 {

    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        int max = candies[0];

        // Find maximum
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        // Answer array
        boolean[] ans = new boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= max) {
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}