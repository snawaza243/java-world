public class JC1_Loader {
    public static void main(String[] args) {
        Class c = JC1_Loader.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader());
    }

}
