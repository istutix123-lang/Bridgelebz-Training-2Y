import java.util.Scanner;
public class gpt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//  -->positive /Negative

        System.out.println(" enter your number ");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println(" positive integer ");
        } else if (a < 0) {
            System.out.println(" Negative integer ");
        } else {
            System.out.println(" zero ");


 //  --> even/odd

        System.out.println(" enter your number ");
        int a = sc.nextInt();
            if (a != 1)
                if (a % 2 == 0) {
                    System.out.println(" even ");
                } else {
                    System.out.println(" odd ");
                    {
                } else {
                System.out.println(" enter your number again because 1 is neither be even nor odd ");
            }


//  --> greater

        System.out.println(" enter your number ");
        int a2 = sc.nextInt();
        System.out.println(" enter your second number ");
            int b = sc.nextInt();
            if (a2 > b) {
                System.out.println(a2 + " is greater ");
            } else {
                System.out.println(b + " is greater ");
            }


 // -->vote

        System.out.println(" enter your number ");
        int a3 = sc.nextInt();
            if (a3 >= 18) {
                System.out.println(" eligible to vote ");
            } else {
                System.out.println(" not eligible to vote ");
            }


 // -->divisible by 5
        System.out.println(" enter your number ");
        int a4 = sc.nextInt();
            if (a4 % 5 == 0) {
                System.out.println("divisible by 5 ");
            } else {
                System.out.println(" not divisible by 5 ");
            }


 // --> divisible by both 5 and 3

        System.out.println(" enter your number ");
        int a5 = sc.nextInt();
            if (a5 % 5 == 0 && a5 % 3 == 0) {
                System.out.println("divisible by both 3 and 5");
            } else {
                System.out.println(" not divisible by 3 and 5 both ");
            }


 // --> Uppercase/lowercase

            char ch = sc.next().charAt(0);
            if (ch >= 65 && ch <= 90) {
                System.out.println(" letter is uppercase ");
            } else if (ch >= 97 && ch <= 122) {
                System.out.println(" letter is lowercase ");
            }


 // -->leap year

        System.out.println(" enter your number ");
        int a6 = sc.nextInt();
            if (a6 % 400 == 0 || (a6 % 4 == 0 && a6 % 100 != 0)) {
                System.out.println(" leap year ");
            } else {
                System.out.println(" not leap year ");
            }


//  --> multiple of 7

            if (a % 7 == 0) {
                System.out.println("multiple of  7 ");
            } else {
                System.out.println(" not multiple of  7");
            }


 // -->pass/fail

        System.out.println(" enter your number ");
        int a7 = sc.nextInt();
            if (a7 >= 40) {
                System.out.println(" pass ");
            } else {
                System.out.println(" fail ");
            }


//-->greatest of 3 no.

       System.out.println(" enter your number ");
        int a8 = sc.nextInt();
        System.out.println(" enter your second  number ");
       int b8 = sc.nextInt();
        System.out.println(" enter your third number ");
         int c = sc.nextInt();
        if (a8>=b8 && a8>=c){
        System.out.println(a8);

         }else if (b8>a8 && b8>c ){
        System.out.println(b8);
          }else{
                  System.out.println(c);
          }


 //--> smallest of 3 no.

         System.out.println(" enter your number ");
        int a9 = sc.nextInt();
        System.out.println(" enter your second  number ");
       int b9 = sc.nextInt();
        System.out.println(" enter your third number ");
         int c9 = sc.nextInt();
       if (a9<=b9 && a9<=c9){
           System.out.println(a + " smallest ");

       }else if (b9<a9 && b9<c9 ){
           System.out.println(b9 + " smallest ");
       }else{
           System.out.println(c9 + " smallest ");
       }


 // --> 3 sides can form a triangle

        System.out.println(" enter your number ");
        int a = sc.nextInt();
        System.out.println(" enter your second  number ");
       int b = sc.nextInt();
        System.out.println(" enter your third number ");
         int c = sc.nextInt();
        if (a < b+c || b < a+c || c < b+a  ){
            System.out.println(" make a triangle ");
        }else {
            System.out.println(" not make a triangle ");
        }


//  -->equilateral / isosceles/ scalene

        System.out.println(" enter your number ");
        int a = sc.nextInt();
        System.out.println(" enter your second  number ");
       int b = sc.nextInt();
        System.out.println(" enter your third number ");
         int c = sc.nextInt();
         if ( a==b && b==c && c==a ){
             System.out.println(" equilateral triangle ");
         } else if (a!= b && b!=c && c!=a) {
             System.out.println(" scalene triangle ");
         } else{
             System.out.println(" isosceles triangle ");
         }


//  -->absolute of a number

        System.out.println(" enter your number ");
        int a = sc.nextInt();
         if (a >0){
             System.out.println(a);
         }else if (a==0){
             System.out.println(0);
        } else{
             System.out.println( a*(-1) );
         }


 // -->lies between 10 - 100

        System.out.println(" enter your number ");
          int a = sc.nextInt();
          if (a>=10 && a<=100){
              System.out.println(" lies between 10 to 100 ");
          } else {
              System.out.println(" not lies between 10 to 100  ");
          }


 // -->gets driving licence
        //  -->child / teenager / adult


         System.out.println(" enter your number ");
         int a = sc.nextInt();
        if (a>= 18 ){
            System.out.println(" getting licence ");
        }else {
            System.out.println(" not getting licence ");
        }


 // -->child / teenager / adult

        if (a<=12 ){
        System.out.println(" child ");
          } else if ( a >= 13 && a<=19 ){
        System.out.println(" Teenager ");
          } else {
                  System.out.println(" Adult ");


 // -->electricity bill
 // -->income tax


 // -->2-digit /3-digit / 4-digit

        System.out.println(" enter your number ");
         int a = sc.nextInt();
         if ( a>=0 && a<=9){
             System.out.println("  1-digit number ");
         } else if ( a>=10 && a<=99) {
             System.out.println(" 2-digit number ");
         } else if ( a>=100 && a<=999) {
             System.out.println(" 3-digit number ");
         } else if ( a>=1000 && a<=9999) {
             System.out.println(" 4- digit number ");
         } else {
             System.out.println(" enter your number again because it is not 1-digit /2-digit /3-digit / 4-digit number ");
         }















        }
    }
