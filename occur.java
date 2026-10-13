import java.util.Scanner;
public class occur{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        System.out.println("enter character");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("occurance=" +count);
}
}