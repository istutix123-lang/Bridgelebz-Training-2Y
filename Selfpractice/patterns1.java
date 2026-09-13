
import java.util.Scanner;
public class patterns1{
public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);

 //   question1
//    *****
//    *****
//    *****
//    *****
//    *****
//    for(int i=0;i<5;i++){
//        for(int j=0;j<5;j++){
//            System.out.print("*");
//        }
//        System.out.println(" ");
//    }



//question2
//        *****
//        *   *
//        *   *
//        *****
//    for(int i=1;i<=4;i++){
//        for(int j=1;j<=5;j++){
//            if(i==1 || i==4 || j==1 || j==5){
//                System.out.print("*");
//            }else {
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//    }


//question3
//    *
//    **
//    ***
//    ****
//        for(int i=1;i<=4;i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//question4
//    ****
//    ***
//    **
//    *
//    for(int i=0;i<=4;i++){
//        for(int j=i;j<=4;j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }


    //question5
//         *
//        **
//       ***
//      ****
//    for(int i=0;i<=4;i++) {
//        for (int j = 1; j <= 4 - i; j++) {
//            System.out.print(" ");
//        }
//        for (int k = 1; k <= i ;k++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }


    //question6
//    1
//    12
//    123
//    1234
//    12345
//    for(int i=1;i<=6;i++){
//        for(int j=1;j<i;j++){
//            System.out.print(j);
//        }
//        System.out.println();
//    }


//question7
//    12345
//    1234
//    123
//    12
//    1
  // int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print(j);
//     }
//     System.out.println("");
// }



 //question8
//    1
//    2   3
//    4   5 6
//    7   8 9  10
//    11 12 13 14 15
//    int k=1;
//for(int i=1;i<=5;i++){
//
//    for(int j=1;j<=i;j++){
//        System.out.print(k+" ");
//        k++;
//    }
//    System.out.println(" ");
//}



    //question 9
//    1
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         if((i+j)%2==0){
//             System.out.print("1");
//         } else {
//             System.out.print("0");
//         }
//     }
//     System.out.println(" ");
// }




    //question10
//    *      *
//    **    **
//    ***  ***
//    ********
//    ********
//    ***  ***
//    **    **
//    *      *

//    for(int i=1;i<=4;i++){
//        for(int j=1;j<=i;j++) {
//            System.out.print("*");
//        }
//            for(int k=1;k<=2*(n-i);k++) {
//                System.out.print(" ");
//            }
//                for(int p=1;p<=i;p++){
//                    System.out.print("*");
//                }
//        System.out.println(" ");
//    }
//    for(int i=4;i>=1;i--){
//        for(int j=i;j>=1;j--) {
//            System.out.print("*");
//        }
//        for(int k=2*(n-i);k>=1;k--) {
//            System.out.print(" ");
//        }
//        for(int p=i;p>=1;p--){
//            System.out.print("*");
//        }
//        System.out.println(" ");
//    }



     //question 11
//    *****
//   *****
//  *****
// *****
//*****
//    int n=5;
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=n-i;j++) {
//            System.out.print(" ");
//        }
//            for (int p = 1; p <=5; p++) {
//                System.out.print("*");
//            }
//                    System.out.print(" ");
//        System.out.println(" ");
//    }




//question 12
//    1
//   2 2
//  3 3 3
// 4 4 4 4
//5 5 5 5 5
//    int n=5;
//for(int i=1;i<=n;i++){
//    for(int j=1;j<=n-i;j++){
//        System.out.print(" ");
//    } for(int k=0;k<i;k++){
//        System.out.print(i + " ");
//    }
//    System.out.println(" ");
//}



//question13
//    1
//   212
//  32123
// 4321234
//543212345
//    int n=5;
//for(int i=1;i<=n;i++){
//    for(int j=1;j<=n-i;j++){
//        System.out.print(" ");
//    } for(int k=i;k>=1;k--){
//        System.out.print(k );
//    }
//    for(int p=2;p<=i;p++){
//        System.out.print(p);
//    }
//    System.out.println(" ");
//}




    //question14
//    *
//   ***
//  *****
// *******
//*********
//*********
// *******
//  *****
//   ***
//    *
//    int n=5;
//for(int i=1;i<=n;i++){
//    for(int j=1;j<=n-i;j++){
//        System.out.print(" ");
//    } for(int k=i;k>=1;k--){
//        System.out.print("*" );
//    }
//    for(int p=2;p<=i;p++){
//        System.out.print("*");
//    }
//    System.out.println(" ");
//}
//    for(int i=n;i>=1;i--){
//        for(int j=n-i;j>=1;j--){
//            System.out.print(" ");
//        } for(int k=1;k<=i;k++){
//            System.out.print("*" );
//        }
//        for(int p=i;p>=2;p--){
//            System.out.print("*");
//        }
//        System.out.println(" ");
//    }



}
}