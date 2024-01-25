class JC2_Class {
    public static int myMethod(int x) {
         
        System.out.println(x);
        return 1;
    }

    int x = 5;

    public static void main(String[] args) {

        myMethod(10);
        JC2_Class myObj = new JC2_Class();
        System.out.println(myObj.x);

        JC2_Class obj1 = new JC2_Class();
        JC2_Class obj2 = new JC2_Class();

        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
