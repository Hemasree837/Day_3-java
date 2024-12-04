import java.util.*;
public class SetBit {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int pos=sc.nextInt();;
        if ((a&(1<<pos))!=0)
        {
            System.out.println("Set Bit");
        }
        else{
            System.out.println("Not a Set Bit");
        }
    }
}
