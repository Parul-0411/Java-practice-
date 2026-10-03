import java.util.Scanner;
public class LeapYear{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year ");
        int n = sc.nextInt();
        if(n%400==0 || ( n%4==0 && n% 100 !=0))
        {
            System.out.println(" this is a leap year");
        }
        else{
            System.out.println(" not a leap year");
        }
    }
}