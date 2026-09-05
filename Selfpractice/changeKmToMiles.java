import java.util.Scanner;
public class changeKmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter km : - ");
        long km = sc.nextLong();
        double miles = km * (0.62137);
        System.out.println( km + " km is equal to the " + miles + " miles");
    }
}