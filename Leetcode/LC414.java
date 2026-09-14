import java.util.Arrays;
public class LC414 {
        public static void main(String []args) {
            int[] nums = {3, 2, 1};
            Arrays.sort(nums);
            int n=0;
            int count=1;
            for(int i=nums.length-1;i>0;i--){
                if(nums[i]!=nums[i-1]){
                    count++;
                    if(count==3){
                        System.out.println(nums[i-1]);
                    }
                }
            }
            System.out.println(nums[nums.length-1]);
        }
    }
