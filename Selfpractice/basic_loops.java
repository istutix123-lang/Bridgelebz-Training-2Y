import java.util.Scanner;
public class basic_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Print numbers from 1 to 10.

       for (int i=1;i<=10;i++){
           System.out.println(i);
       }


//        Print numbers from 10 to 1.

        for ( int i=10;i>=1;i--){
            System.out.println(i);
        }


//        Print numbers from 1 to N.

        System.out.println(" Enter a number ");
        int a= sc.nextInt();
            for(int i=1;i<=a;i++){
                System.out.println(i);
            }


//        Print numbers from N to 1.

        System.out.println(" Enter a number ");
            int b= sc.nextInt();
            for(int i=b;i>=1;i--){
                System.out.println(i);
            }


//        Print even numbers from 1 to N.

        System.out.println(" enter a number ");
        int c= sc.nextInt();
        for (int i=1;i<=c;i++){
            if(i%2==0){
                System.out.println("even number is  " + i );
            }
        }


//        Print odd numbers from 1 to N.

        System.out.println(" enter a number ");
        int d= sc.nextInt();
        for (int i=1;i<=d;i++){
            if(i%2!=0){
                System.out.println("odd number is  " + i );
            }
        }


//        Print multiples of 5 up to N.

        System.out.println(" Enter a number");
        int e = sc.nextInt();
        for (int i = 1; i <= e; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }


//                Print numbers divisible by both 3 and 5.

        System.out.println(" enter a number ");
        int f= sc.nextInt();
        for(int i=1;i<=f;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
            }
        }



//        Print squares of numbers from 1 to N.



        System.out.println(" enter a number ");
        int g= sc.nextInt();
        for( int i=1; i<=g;i++){
             System.out.println(i*i);
         }



//        Print cubes of numbers from 1 to N.

        System.out.println(" enter a number ");
        int h= sc.nextInt();

        for( int i=1; i<=h;i++){

            System.out.println(i*i*i);
        }



    }

}