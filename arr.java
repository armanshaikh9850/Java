import java.util.Scanner;
public class arr
{
    public static void main(String args[])
    {
        int a1[]=new int[10];
        try (Scanner sc = new Scanner(System.in))
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Enter the value of a1["+(i+1)+"]:");
                a1[i]=sc.nextInt();
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("a1["+(i+1)+"]="+a1[i]);
        }
    }
}
