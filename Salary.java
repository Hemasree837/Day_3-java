import java.util.*;
public class Salary {
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int pp=sc.nextInt();
        int exp=sc.nextInt();
        double curr_sal=sc.nextInt();
        double new_sal;
        if (pp>=5 && exp>=10 && curr_sal>=50000)
        {
            new_sal=(curr_sal+(curr_sal/100)*10);
            System.out.println("Incremented Salary=" + new_sal);
            
        }
        else if(pp>=3 && pp<5 && exp>=5 && exp<10 && curr_sal>=30000 && curr_sal<=50000 )
        {
            new_sal=(curr_sal+(curr_sal/100)*8);
            System.out.println("Incremented Salary=" + new_sal);

        }
        else if(pp>=1 && pp<3 && exp>=1 && exp<5 && curr_sal>=15000 && curr_sal<=30000 )
        {
            new_sal=(curr_sal+(curr_sal/100)*6);
            System.out.println("Incremented Salary=" + new_sal);

        }
        else
        {
            System.out.println("You are not eligible for increment");
        }
    }   
}
