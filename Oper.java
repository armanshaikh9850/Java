public class Oper
{
    public static void main(String args[])
    {
        int a=5;
        int b=1;
        int c=a|=b; // Using  Bitwise Operator |
        System.out.println("Answer  | : " +c);
        System.out.println("Answer % : "+a%b); // Using  Bitwise Operator %
        c=a&b;
        System.out.println("Answer & : "+c); // Using  Bitwise Operator &
        c=a^b;
        System.out.println("Answer ^ : "+c); // Using  Bitwise Operator ^
        c=a<<b;
        System.out.println("Answer << : "+c); // Using  Bitwise Operator <<
        c=a>>b;
        System.out.println("Answer >> : "+c); // Using  Bitwise Operator >>
        c=a>>>b;
        System.out.println("Answer >>> : "+c); // Using  Bitwise Operator >>>
        System.out.println("Answer ~ : "+ ~a);
        System.out.println("Answer && : "+(a > 6 && b < 10)); // Using  Bitwise Operator &&
        System.out.println("Answer || : "+(a > 6 || b < 10)); // Using  Bitwise Operator ||
        System.out.println("Answer ! : "+!(a > 5 || b < 1)); // Using  Bitwise Operator !
        System.out.println("Answer ++ : "+ ++a); // Using Increment Operator
        System.out.println("Answer ++ : "+ --b); // Using Decrement Operator 
    }
}