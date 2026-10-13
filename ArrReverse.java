import java.util.Scanner;
public class ArrReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] a = new int[n];
        int sum=0;
        System.out.println("enter numbers");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("reverse arr");
        for(int i=n-1;i>=0;i--){
            System.out.println(a[i]  + " ");
        }

        }
    }
