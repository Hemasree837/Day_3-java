import java.util.*;
public class PowerOf2 {
    public static void main(String args[])
    {
        //Any Power of 2
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=String.format("The square of %d is:",n);
        System.out.println(res);
        System.out.println(1<<n);

    }
}
