 public class LC704 {
    public static void main(String[] args){
       int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target ){
                System.out.println(mid);
                break;
            } else if(nums[mid]<target){
                left=mid+1;
            } else {
                right =mid-1;
            }
        }
        System.out.println(-1);
    }
}
