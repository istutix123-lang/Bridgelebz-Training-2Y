import java.util.*;
class LC09 {
    public static void main(String[]args){
       int x = 121;
        if(x<0){
            System.out.println("false");;
        }
        int original=x;
        int reverse=0;
        while(x>0){
            int count=x%10;
            reverse=reverse*10+count;
            x=x/10;
        }
        System.out.println(original==reverse);
    }
}

