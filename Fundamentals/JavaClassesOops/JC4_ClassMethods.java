class JC4_ClassMethods {
    static void myStaticMethod() {
        System.out.println("This is static method");
    }

    private void myPublicMethod() {
        System.out.println("This is public method");
    }

    public static void main(String[] args) {
        JC4_ClassMethods myObj = new JC4_ClassMethods();
        myStaticMethod();
        myObj.myStaticMethod();
        myObj.myPublicMethod();
        // public method access with obj with dot
    }
}