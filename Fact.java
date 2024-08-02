import java.util.Scanner;
public class Fact {
    public static void main(String args[])
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter a Number : ");
            int n = sc.nextInt();
            int fact=1;
            for(int i=2;i<=n;i++)
            {
                fact*=i;
            }
            System.out.println("Factorial of "+n+" is : "+fact);
            
        }
    }
    
}
