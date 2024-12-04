import java.util.*;
public class checkmultiple4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n&3)==0)
        System.out.println("It is a multiple of 4");
        else
        System.out.println("Not a multiple of 4");
    }
}
    

