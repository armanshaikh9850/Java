import java.util.Scanner;
public class Scan  //Using Scanner Class for Taking Input from User
{
    public static void main(String args[])  // Main ()
    {
        int a;
        int b;
        try (Scanner sc = new Scanner(System.in)) {      // Syntax Using Scanner inside try block
            System.out.print( " Enter two Integers : ");
            a = sc.nextInt(); //Converting string to int
            b = sc.nextInt();
        }
        int sum=a+b;
        System.out.print("Sum of Two Digits : "+sum); //Integer is treated as a String in print()
    }
}