import java.util.Scanner;
public class average{
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
            sum=sum+a[i];
        }
        double average=(double) sum/n;
        System.out.println("average : " +average);

        }
    }
