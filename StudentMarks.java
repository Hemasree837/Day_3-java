import java.util.*;
public class StudentMarks {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    //local variable for the class and global variable for main method
    int s1=sc.nextInt();
    int s2=sc.nextInt();
    int s3=sc.nextInt();
    int s4=sc.nextInt();
    int s5=sc.nextInt();
    String a=sc.next();
    
    boolean p=s1>=35 && s2>=35 && s3>=35 && s4>=35 && s5>=35;
    double avg=(s1+s2+s3+s4+s5)/5;
    if (avg>=80 && avg<=100 && p)
    {
        //Global for if stmt and local for main method
        String f=String.format("%s your status =PASS and Grade=A",a);
        System.out.println(f);
    }
    else if(avg>=60 && avg<=80 && p)
    {
        String f=String.format("%s your status =PASS and Grade=B",a);
        System.out.println(f);
    }
    else if(avg>=40 && avg<=60 && p)
    {
        String f=String.format("%s your status =PASS and Grade=C",a);
        System.out.println(f);

    }   
    else
    {
        String f=String.format("%s your status =FAIL and Grade=F",a);
        System.out.println(f);

    } 

  }    
}