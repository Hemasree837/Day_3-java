import java.util.*;
public class checkpower4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n&(n-2))==0)
        System.out.println("It is a power of 4");
        else
        System.out.println("Not a power of 4");
    }
}