import java.util.Scanner;
class Power{
    public static void main(String[] args)
    {
Scanner sc = new Scanner ( System.in);
System.out.println("enter base");
int base = sc.nextInt();
System.out.println("enter exponent");
int exponent = sc.nextInt();
int result=1;
for(int i =1;i<=exponent;i++)
{
    result=result*base;
}
System.out.println("Power=" + result);
    }
}