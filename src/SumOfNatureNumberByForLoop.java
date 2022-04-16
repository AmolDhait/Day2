import java.util.Scanner;

public class SumOfNatureNumberByForLoop {
    public static void main(String args[])
    {
        int x, i ;
        int sum = 0;
        System.out.println("Enter Number:");
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        for(i=1; i<=x; i++)
        {
            sum = sum +i;
        }
        System.out.println("Sum of "+x+" numbers is :"+sum);
    }
}
