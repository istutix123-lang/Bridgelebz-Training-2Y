import java.util.Scanner;
    public static void main(String[] args){
        int [] customers = {1,0,1,2,1,1,7,5};
        int [] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        int s=0;
        int m=0;
        int a=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                s=s+customers[i];
                customers[i]=0;
            }
        }
        for(int i=0;i<minutes;i++){
            a=a+customers[i];
        }
        m=a;
        for(int i=minutes;i<customers.length;i++){
            a=a-customers[i-minutes]+customers[i];
            m=Math.max(m,a);
        }
        System.out.println(s+m);;
    }

