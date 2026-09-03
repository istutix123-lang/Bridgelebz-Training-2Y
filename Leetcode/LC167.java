import java.util.Arrays;

class Lc167 {
    public static void main(String[] args){
        int [] arr = {2,7,11,15};
        int target = 9;
        int l=0;
        int r=arr.length-1;
        int [] newarr=new int[2];
        while(l<=r){
            if(arr[l]+arr[r]==target){
                newarr[0]=l+1;
                newarr[1]=r+1;
                System.out.println (Arrays.toString(newarr));

            } else if (arr[l]+arr[r]<target){
                l++;
            } else{
                r--;
            }
        }
       
    }
}