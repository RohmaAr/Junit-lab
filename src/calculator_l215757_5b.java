// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

/**
 *
 * @author fast
 */
public class calculator_l215757_5b {
    public static void main(String[] arr){
        System.out.println("Enter two numbers :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        System.out.println(n+"+"+k+"="+sum(n,k));
        System.out.println(n+"-"+k+"="+sub(n,k));
        System.out.println(n+"*"+k+"="+prod(n,k));
        System.out.println(n+"/"+k+"="+div(n,k));
    }
    public static int sum(int i,int j)
    {
        return i+j;
    }
    public static int sub(int i,int j)
    {
        return i-j;
    }
    public static int prod(int i,int j)
    {
        return i*j;
    }
    public static int div(int i,int j)
    {
        if(j!=0)
        {
            return i/j;
        }
        else
        {
            System.out.println("impossible to / by 0");
        }
        return 0;
    }
}
