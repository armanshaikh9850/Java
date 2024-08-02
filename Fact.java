import java.util.Scanner; // Scanner Class for reading input from user
public class Fact {
    public static void main(String args[]) // Main function 
    {
        try(Scanner sc = new Scanner(System.in)) // Scanner Syntax
        {
            System.out.print("Enter a Number : ");
            int n = sc.nextInt(); // Converting the data type from default string to integer
            int fact=1;
            for(int i=2;i<=n;i++)
            {
                fact*=i; // Formula placed inside a basic for loop
            }
            System.out.println("Factorial of "+n+" is : "+fact);
            
        }
    }
    
}
