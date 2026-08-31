import java.util.Scanner;
public class LC643 {
    public static void main(String[] args){
       int [] nums = {1,12,-5,-6,50,3};
                int  k = 4;
                int sum=0;

                for(int i=0;i<k;i++){
                    sum=sum+nums[i];
                }
                int maxsum=sum;
                for(int i=k;i<nums.length;i++){
                    sum=sum-nums[i-k]+nums[i];
                    maxsum=Math.max(maxsum,sum);
                }
        System.out.println((double)maxsum/k);
            }
        }


