import java.util.*;
 class Alphabeticalsort{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int i;
        String s1=" ";
System.out.println("enter a string");   
s=sc.nextLine();
int I = s.length();
for(char x='a';x<='z';x++)
    {
        for(i=0;i<I;i++)
        {
            char c = s.charAt(i);
            if(c==x)
            {
                System.out.print(c);
            }
        }
    } 
}
}