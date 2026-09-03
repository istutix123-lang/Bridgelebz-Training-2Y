import java.util.Scanner;
public class numberLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


      // Prime number.

        System.out.println(" enter a number ");
        int a= sc.nextInt();
       if(a!=1) {
           int count = 0;
           for (int i = 1; i <= a; i++) {
               if (a % i == 0) {
                   count++;
               }
           }
           if (count > 2) {
               System.out.println(" not prime number ");
           } else {
               System.out.println(" prime number ");
           }
       }


       // Print primes from 1 to N.

        System.out.println(" enter a number ");
        int p= sc.nextInt();
        for(int k=1;k<=p;k++) {
            int b=k;
            if (b != 1) {
                int count2 = 0;
                for (int i = 1; i <= b; i++) {
                    if (b % i == 0) {
                        count2++;
                    }
                }
                if (count2 > 2) {
                } else {
                    System.out.println(b);
                }
            }

        }


    //    Armstrong number.


        System.out.println(" enter a number ");
        int c= sc.nextInt();
        int original=c;
        int count=0;
        while(c>0) {
            c = c / 10;
            count++;
        }
          c=original;
        int sum=0;
        while(c>0){
            int rem=c%10;
            sum=sum+(int)Math.pow(rem,count);
            c=c/10;
        }if(original==sum){
            System.out.println(" armstrong ");
        }else {
            System.out.println(" not  armstrong");
        }


     //   Print Armstrong numbers from 1 to N.

        System.out.println(" enter a number ");
        int p= sc.nextInt();
        for( int i=1;i<=p;i++){
            int d=i;
            int original3 = d;
            int count3 = 0;
            while (d > 0) {
                d = d / 10;
                count3++;
            }
            d = original3;
            int sum3 = 0;
            while (d > 0) {
                int rem2 = d % 10;
                sum3 = sum3 + (int) Math.pow(rem2, count3);
                d = d / 10;
            }
            if (original3 == sum3) {
                System.out.println(original3);
            }
        }


      //  Perfect number.

        System.out.println("enter a number ");
        int d= sc.nextInt();
        int original4=d;
        int temp=0;
        int sum3=0;
        for(int i=1;i<=d;i++){
            if(d%i==0){
              sum3=sum3+i;
            }
        }temp=sum3-original4;
       if(temp==original4){
           System.out.println(" it is perfect number ");
       }else{
           System.out.println(" not a perfect number ");
       }


//        Strong number.
//              145
//             1!+4!+5!
//            1+24+120
//              145

        System.out.println(" enter a number");
        int n = sc.nextInt();
        int c2;
        int h;
        int count5 = 0;
        int temp5;
        while (n > 0) {
            c2 = n % 10;
        for (int i = 1; i <= c2; i++) {
                int p1 = i;
                temp = i * p;
                 h=temp;
            }
            temp=h;
            System.out.println(temp5);n=n/10;
            count5=count5+temp5;

        }



                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                int original = num;
                int sum = 0;

                while (num > 0) {
                    int digit = num % 10;

                    // Find factorial of the digit
                    int factorial = 1;
                    for (int i = 1; i <= digit; i++) {
                        factorial = factorial * i;
                    }

                    sum = sum + factorial;
                    num = num / 10;
                }

                if (sum == original) {
                    System.out.println(original + " is a Strong Number.");
                } else {
                    System.out.println(original + " is not a Strong Number.");
                }

                sc.close();










//                System.out.print("Enter a number: ");
//                int n = sc.nextInt();
//
//                int sum = 0;
//
//                while (n > 0) {
//                    int digit = n % 10;      // Extract last digit
//                    int square = digit * digit; // Square of the digit
//                    sum = sum + square;      // Add to sum
//                    n = n / 10;              // Remove last digit
//                }
//
//                System.out.println("Sum of squares of digits = " + sum);
//






//        Neon number.

//        System.out.println(" enter a number ");
//        int ab= sc.nextInt();
//        int count = ab*ab;
//        int original=ab;
//    int rem=0;
//        for(int i=1;i<=count;i++){
//            int temp=count%10;
//            rem=rem+temp;
//            count=count/10;
//        }
//        if(original==rem){
//            System.out.println(" neon number ");
//        }else{
//            System.out.println(" not a neon number ");
//        }



//        Automorphic number.
//        System.out.println(" enter a number ");
//        int d= sc.nextInt();
//        int temp3=d*d;
//        int count4=temp3%10;
//        if(d==count4){
//            System.out.println("automorphic number ");
//        }else {
//            System.out.println(" this is not  automorphic number ");
//        }



//        Duck number.
//
//        System.out.println(" enter a number ");
//                        int b=sc.nextInt();
//                        int original=b;
//                        int count5=0;
//                        int rem5=0;
//                        while(b>0){
//                            count5=b%10;
//                              rem5=count5;
//                            b=b/10;
//                        }int p=original;
//                        if(rem5!=0){
//                        while(p>0){
//                            int temp5=p%10;
//                            if(temp5==0){
//                                System.out.println(" yes");
//                                break;
//                            }
//                                p=p/10;
//                        }
//              }else{
//                            System.out.println(" not duck number ");
//                        }


//        (gpt code)
//        System.out.println("Enter a number");
//        int b = sc.nextInt();
//        int original = b;
//        int firstDigit = 0;
// Find the first digit
//        while (b > 0) {
//            firstDigit = b % 10;
//            b = b / 10;
//        }
//        int p = original;
//        boolean found = false;
// Check for zero only if the first digit is not zero
//        if (firstDigit != 0) {
//            while (p > 0) {
//                int temp = p % 10;
//                if (temp == 0) {
//                    found = true;
//                    break;
//                }
//                p = p / 10;
//            }
//            if (found) {
//                System.out.println("Duck Number");
//            } else {
//                System.out.println("Not Duck Number");
//            }
//        } else {
//            System.out.println("Not Duck Number");
//        }
//






//        Spy number.
//        System.out.println(" enter a number ");
//        int m= sc.nextInt();
//        int count=0;
//        int original=m;
//        int sum=0;
//        while(m>0){
//            count=m%10;
//            sum=sum+count;
//            m=m/10;
//        }
//       m=original;
//        int count2=0;
//        int product=1;
//        while(m>0){
//            count2=m%10;
//           product=product*count2;
//            m=m/10;
//        }
//        if(sum==product){
//            System.out.println(" spy number ");
//        }else{
//            System.out.println(" not a spy number ");
//        }



        }


    }