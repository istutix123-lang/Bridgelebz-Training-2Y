import java.util.Scanner;
public class arr_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count = 0;
        while (n > 0) {
            int temp = n % 10;

            if (n % temp == 0) {
                count++;
            }
            n = n / 10;


        }
       System.out.println(count);
int [] marks={1,1,1,1,1};
        int sum=0;
        for(int element:marks) {
            sum = sum + element;

            System.out.print( sum+ ",");
        }
        int[] arr = {1, 3,7,5,10};
        for (int element : arr) {

            for (int k = 1; k <= element; k++) {
                int b = k;
                if (b != 1) {
                    int count2 = 0;
                    for (int i = 1; i <= b; i++) {
                        if (b % i == 0) {
                            count2++;
                        }
                    }
                    if (count2 > 2) {
                    } else {
                        System.out.println(count2);
                    }
                }

            }
        }


        System.out.println(" enter a number ");
        int n2=sc.nextInt();
       for(int i=1;i<=n2;i++){
           if(i%3==0 && i%5==0){
           System.out.println(" fizzbuzz");
       }else if ( i%5==0 && i%3!=0){
               System.out.println(" buzz ");
           }else if(i%3==0 && i%5!=0){
               System.out.println(" fizz");
           }
           else {
               System.out.println(i);
           }
       }









    }
}



