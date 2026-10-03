import java.util.Scanner;
public class QR{
   public static void main(String [] args)
   {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter dividend");
    int a = sc.nextInt();
    System.out.println("enter divisor");
    int b = sc.nextInt();
    int qoutient = a/b;
    int remainder = a%b;
    System.out.println("qoutient="+qoutient);
    System.out.println("remainder="+remainder);

   } 
}