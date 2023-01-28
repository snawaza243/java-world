public class OperatorBitwise {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 7;

        System.out.println("a = " + a + "\nb = " + b);
        System.out.println("a & b: " + (a&b));
        System.out.println("a | b: " + (a|b));
        System.out.println("a ^ b: " + (a^b));
        System.out.println("a ~ B: " + (~a));

        a &=b;
        System.out.println("a = " + a);

    }
    
}
