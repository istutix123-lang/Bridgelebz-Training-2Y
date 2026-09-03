import java.util.Scanner;
public class gpt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        --> print from 1to 10
//        for (int i=1 ; i<=10 ; i++){
//            System.out.println(i);
//        }
//       --> print from 10 to 1
//    int i = 10;
//        while( i>= 1){
//            System.out.println(i);
//            i--;
//        }
//        -->print even from 1 to 100
//        for ( int i=1 ;i<=50;i++ ){
//            System.out.println(2*i);
//
//
//         -->print odd from 1 to 100
//
//        for( int i = 1 ; i <=100 ; i++){
//            if (i % 2 !=0 ){
//                System.out.println(i);
//            }
//        }
//
//        -->multiplication of table
//
//        System.out.println(" which table do you want ");
//        int a = sc.nextInt();
//        for( int i =1 ; i<=10 ; i++){
//            System.out.println(a*i);
//        }


//    --> sum of n natural number
//        System.out.println(" enter your number ");
//        int n = sc.nextInt();
//        int c= 0;
//        for(int i=1; i<=n;i++){
//        c=c+i;
//        }
//        System.out.println(c);

//  -->sum of n even number

//        System.out.println(" enter your number ");
//        int n = sc.nextInt();
//        int c = 0 ;
//       for( int i = 1 ; i<=n ; i++){
//        if( i % 2 == 0){
//            c=c+i;
//        }
//       } System.out.println(c);

//  -->sum of n odd number

//        System.out.println(" enter your number ");
//        int n = sc.nextInt();
//        int c = 0 ;
//        for( int i = 1 ; i<=n ; i++){
//            if( i % 2 != 0){
//                c=c+i;
//            }
//        } System.out.println(c);

//    --> count the number

//        System.out.println(" enter a number ");
//        int n = sc.nextInt();
//        for ( int i = 1 ; i<= n; i++){
//            System.out.println(i);
//        }

//      --> divisible by 5 in 1 to 100

//        for( int i = 1; i<= 100 ; i++){
//            if (i % 5 == 0) {
//                System.out.println(i);
//            }
//        }

//
//    -->factorial of a number
//        System.out.println(" enter a number ");
//        int a = sc.nextInt();
//        int c = 1;
//        int p= 0;
//        for( int i = 1 ; i<=a; i++){
//            c=c*i;
//
//        }System.out.println(" factorial of " + a + " = " + c );

//        -->reverse n natural number

//        System.out.println(" enter a number ");
//    int a = sc.nextInt();
//    for (int i=a;i>=1;i--){
//        System.out.println(i);
//    }

//    --> reverse of number

//        System.out.println(" enter a number ");
//        int n = sc.nextInt();
//        int c= 0;
//        while (n>0){
//            c= n%10;
//            System.out.print(c);
//            n=n/10;
//        }

//        --> count a digit of number
//        System.out.println(" enter a number ");
//        int n = sc.nextInt();
//        int c= 0;
//        while(n>0){
//            n=n/10;
//        c++;
//        }
//        System.out.println(c);


//  --> sum of digit of number
//        System.out.println(" enter a number ");
//        int n = sc.nextInt();
//        int c= 0;
//        int t= 0;
//        while (n>0) {
//            c = n % 10;
//            t=t+c;
//        n=n/10;
//        } System.out.print(t);


//       --> palindrome number
//        System.out.println(" enter a number ");
//        int n = sc.nextInt();
//        int original = n;
//        int reverse=0;
//        int digit= 0;
//        while (n>0){
//            digit= n%10;
//            System.out.print(digit);
//            reverse = reverse*10+digit;
//             n=n/10;
//        }
//        if(original==reverse){
//            System.out.println("  palindrome number ");
//        }else{
//            System.out.println(" not  palindrome number ");
//        }

//  -->armstrong number
//        System.out.println(" enter a number ");
//        int n = sc.nextInt();
//        int original = n;
//        int c=0;
//        int t;
//        while(n>0){
//           c= n%10;
//            System.out.print(c);
//            n=n/10;
//        }


//                       System.out.print("Enter a number: ");
//                int num = sc.nextInt();
//
//                int original = num;
//                int temp = num;
//                int digits = 0;
//
//                // Count number of digits
//                while (temp > 0) {
//                    digits++;
//                    temp = temp / 10;
//                }
//
//                int sum = 0;
//                temp = num;
//
//                // Calculate Armstrong sum
//                while (temp > 0) {
//                    int rem = temp % 10;
//                    sum = sum + (int)Math.pow(rem, digits);
//                    temp = temp / 10;
//                }
//
//                if (sum == original) {
//                    System.out.println(original + " is an Armstrong Number");
//                } else {
//                    System.out.println(original + " is Not an Armstrong Number");
//                }


//  --> prime number

        System.out.println(" enter a number ");
        int n = sc.nextInt();
        int c = 0;
    if( n!=1) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c > 2) {
            System.out.println(" not a prime no.");
        } else {
            System.out.println(" yes it is prime ");
        }
    }else{
        System.out.println(" enter your number again because 1 is not prime ");
    }


//    print 1 to n prime number

//        System.out.println(" enter a number ");
//        int p = sc.nextInt();
//        for( int k=1; k<=p ; k++){
//           int n=k;
//            int c = 0;
//            for (int i = 1; i <= n; i++) {
//                if (n % i == 0) {
//                    c++;
//                }
//            }
//            if (c == 2) {
//                System.out.println(n);
//            }else{
//                continue;
//            }
//        }


//       -->  *****
//            *****
//            *****
//        System.out.println(" enter a  number ");
//        int n= sc.nextInt();
//        for ( int i=1; i<=n ; i++){
//            for (int j=0; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


//        *
//        **
//        ***
//        ****
//        *****

//        System.out.println(" enter a number");
//        int n= sc.nextInt();
//        for (int i=1; i<=n ; i++){
//            for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

//        *****
//        ****
//        ***
//        **
//        *
//
//        System.out.println(" enter your number ");
//        int n= sc.nextInt();
//        for( int i=1 ; i<=n;i++){
//            for (int j=n;j>=i;j--) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


//  -->   1
//        12
//        123
//        1234
//        12345
//

//        System.out.println(" enter a number ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++)
//        {
//            for (int j = 1; j <= i; j++)
//            {
//                    System.out.print(j);
//                }
//                System.out.println(" ");
//            }




//        54321
//        4321
//        321
//        21
//        1
//        System.out.println(" enter a number ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++)
//        {
//            for (int j = n; j >= i; j--)
//            {
//                    System.out.print(j);
//                }
//                System.out.println(" ");
//            }





    }
}



