package javaapplication4;
import java.util.*;
/**
 *
 * @author NK
 */
public class JavaApplication4
{
public void con(int min)
    {
        double minutesInYear = 60 * 24 * 365;
        
    
        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        int min = sc.nextInt();
        JavaApplication4 m=new JavaApplication4();
        m.con(min);
    }
         
    
}
