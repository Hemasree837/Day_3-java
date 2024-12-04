import java.util.*;
public class Checkpower {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n&(n-1))==0)
        System.out.println("It is a power of 2");
        else
        System.out.println("Not a power of 2");
    }
}
