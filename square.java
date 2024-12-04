import java.util.*;
public class square {
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int n=x/10;
    int k=x%10;
    System.out.println("Maximum no.of squares:"+((n/k)*(n/k)));

   } 
}
