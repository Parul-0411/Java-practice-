import java.util.Scanner;
public class Compoundinterest{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter principal");
        double p = sc.nextDouble();
        System.out.println(" Enter rate");
        double r = sc.nextDouble();
        System.out.println("Enter time");
        double t = sc.nextDouble();
        double amount=p*Math.pow((1+r/100),t);
        double Compondinterest=amount-p;
        System.out.println("compound interest = "+  Compondinterest);
        System.out.println("total amount ="+amount);
    }
}
        