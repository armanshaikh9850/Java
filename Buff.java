import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Buff  //Using BufferedReader Class for Taking Input from User
{
    public static void main(String args[]) throws IOException  // For Handling Error
    {
        int a;
        int b;
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));  // Syntax for BufferedReader
        System.out.print("Enter Two Integers : ");
        a=Integer.parseInt(br.readLine());  // Converting String args[] to Integer
        b=Integer.parseInt(br.readLine());
        int sum=a+b;
        System.out.print("Sum of Two Integers : "+sum);
    }
}
