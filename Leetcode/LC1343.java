
class LC1343 {
    public static void main(String[] args){
       int [] arr = {2,2,2,2,5,5,5,8};
       int k = 3;
       int threshold=0;
        int count=0;
        int sum =0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];

        }
        int avg=sum/k;
        if(avg>=threshold){
            count++;
        }
        int maxsum=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum-arr[i-k]+arr[i];
            int a=sum/k;
            if(a>=threshold){
                count++;
            }

        }
        System.out.println(count);
    }
}