public class Java_Math {
    
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 543;
        double num3 = 43.432;
        double num4 = -43.432;

        System.out.println(Math.min(num1, num2));
        System.out.println(Math.cbrt(num1));
        System.out.println(Math.round(num4));
        System.out.println(Math.exp(num1));
        System.out.println(Math.abs(num3));
        System.out.println(Math.abs(num4));

        int ranNum = (int) (Math.random()*101);
        System.out.println(Math.random());
        System.out.println(ranNum);


    }
}
