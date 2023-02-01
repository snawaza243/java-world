
class JC2_ClassObj {

    public static int myMeth3(int x) {
        System.out.println(x);
        return 1;
    }

    public static void main(String[] args) {
        JC2_Class obj3 = new JC2_Class();
        myMeth3(obj3.x);

    }
}