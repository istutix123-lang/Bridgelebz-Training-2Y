import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //       System.out.println(" enter a size of an array ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        int largest = arr[0];
//        for (int element : arr) {
//            if (element > largest) {
//                largest = element;
//            }
//        }
//        System.out.println(largest);
//

//       int smallest=arr[0];
//        for(int element:arr){
//            if(element<smallest){
//                smallest=element;
//            }
//        }
//        System.out.println(smallest);

//        int []arr={2,1,6,8,0};
//        float sum= 0;
//        float avg=1;
//        for(int element: arr){
//            sum=sum+element;
//             avg=sum/arr.length;
//        }
//        System.out.println(avg);

//        int []arr= { 3,6,8,6,1,6,0};
//        int count=0;
//        int digit = arr[0];
//        for(int element : arr){
//            if (element == digit){
//             int digit2=element;
//                count++;
//            }
//        }
//        System.out.println(count);


//      input array
//        int n= sc.nextInt();
//        int []arr = new int [n];
//    for(int i=0;i<n;i++){
//        arr[i]=sc.nextInt();
//    }
//for(int i=0;i<n;i++){
//    System.out.print(arr[i] + " ");
//}

//     even element in array
//        int [] arr ={3,7,8,4,5};
//        for(int element : arr){
//            if(element%2==0){
//                System.out.println(element);
//            }
//        }
        //     reverse order array
//        int [] arr= { 1,2,3,4,5};
//        for(int i=arr.length-1; i >=0;i--){
//            System.out.print(arr[i]);
//        }

// sum of array
//        int sum=0;
//        int [] arr= { 1,2,3,4,5};
//        for (int i=0;i< arr.length;i++){
//         sum=sum+arr[i];
//        }
//        System.out.println(sum);


        // sum of even
//        int sum=0;
//        int [] arr= { 1,2,3,4,5};
//        for (int i=0;i< arr.length;i++){
//            if(arr[i]%2==0) {
//                sum = sum + arr[i];
//            }
//        }
//        System.out.println(sum);


// linear search
//        int flag=0;
//        int [] arr = {2,4,6,3,8};
//        int target = 9;
//        for(int i=0; i<arr.length;i++){
//            if(arr[i]==target){
//                flag=1;
//                System.out.println(i);
//                break;
//            }
//        }
//        if (flag==0){
//            System.out.println("-1");
//        }
        //  count the target element
//        int [] arr = {2,4,6,2,2};
//        int target = 2;
//        int count=0;
//        for(int i=0; i<arr.length;i++){
//            if(arr[i]==target){
//               count++;
//
//
//            }
//        }
//        System.out.println(count);
//
        //     split odd and even number
//        int [] arr= { 1,3,6,4,2,9,0};
//        int even=0;
//        int odd=0;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]%2==0){
//               even=arr[i];
//                System.out.println(even);
//            }else {
//                odd=arr[i];
//                System.out.println(odd);
//            }
        //   frequency of every element

        int[] arr = {2, 4, 6, 2, 2};
        for (int element : arr) {
             int target = element;
            int count = 0;
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == target)
                {
                    count++;

                }
            }
            System.out.println(target  + "occurs " +  count + " times ");

        }

//    prime element of array


//        int[] arr = {2, 3, 4, 6, 8, 7};
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int k = 1; k <= arr[i]; k++) {
//                if (arr[i] % k == 0) {
//                    count++;
//                }
//            }
//            if (count == 2) {
//                System.out.println( arr[i]);
//            }
//
//        }



//
//        int []arr={1,2,4,5,1,9};
//        int []arr2 = new int[arr.length];
//        int sum =0;
//        for(int i=0;i<arr.length;i++){
//
//            sum=sum+arr[i];
//            arr2[i]=sum;
//
//        }
//        System.out.println(java.util.Arrays.toString(arr2));
//            int []arr={1,7,3,6,5,6};
//            int L_sum=0;
//            int R_sum=0;
//            for(int i=0;i<arr.length;i++){
//             L_sum=L_sum+arr[i];
//            }
//            for(int j=arr.length;j>0;j--){
//                R_sum=R_sum+arr[j];
//            }
//        if(L_sum==R_sum){
//            System.out.println(i);
//        }



//        int [] arr={-5,1,5,0,-7};
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//            System.out.println(sum);
//        }

        //1122
        //1364
        //1436
        //217
        //1394
        //3005
        //3003
        //645
        //349
        //1732
        //169
        //1512
//       intersection of  array
//            int [] arr1={1,2,4,6,8};
//            int [] arr2={3,2,4,6,9};
//            for(int i=0;i<arr1.length;i++) {
//
//                for (int j = 0; j < arr2.length; j++) {
//                    if (arr1[i] == arr2[j]) {
//                        System.out.println(arr1[i]);
//                    }
//
//                }
//
//            }
            // union of two array
//        int [] arr1={1,2,4,6,8};
//        int [] arr2={3,2,4,6,9};
//        for(int i=0;i<arr1.length;i++) {
//            System.out.print(arr1[i] + " ");
//        }
//        int digit=0;
//        for(int element:arr2){
//            int target=element;
//
//            for(int i=0;i<arr1.length;i++){
//                if (arr1[i] != element) {
//                   digit=element;
//                }
//            }
//
//        }
//        System.out.println(digit);




//        Find maximum element
//        int  [] arr1= { 9,3,7,8,9,6,6};
//        int largest = arr1[0];
//        for(int i=0;i< arr1.length;i++){
//            if (arr1[i] >largest){
//                largest=arr1[i];
//            }
//        }
//        int secondlargest=Integer.MIN_VALUE;
//        for(int element :arr1){
//            if(largest>element&& element > secondlargest){
//                secondlargest=element;
//
//            }
//        }
//        int thirdlargest=Integer.MIN_VALUE;
//        for(int element :arr1){
//            if(secondlargest>element && element > thirdlargest){
//                thirdlargest=element;
//
//            }
//        }
//        System.out.println(thirdlargest);


//        Find minimum element
//        int  [] arr2= { 9,3,3,2,9,7,8};
//        int smallest = arr2[0];
//        for(int i=0;i< arr1.length;i++){
//            if (arr2[i] <smallest){
//                smallest=arr2[i];
//            }
//        }
//        System.out.println(smallest );
//        Find second largest







//        Find second smallest
//        Find sum
//        Find average
//        Count frequency of an element
//        Search an element
//        Linear Search
//        Find index of an element
//        Replace an element
//        Reverse an array
//        Swap two elements
//        Copy array
//        Compare two arrays


//        int  [] arr= { 0,3,5,6,8,9,6};
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-3]);
    }
}



