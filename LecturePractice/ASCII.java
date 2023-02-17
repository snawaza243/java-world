public class ASCII {
    public static void main(String[] args) {
        for(int i=0;i<256; i++)
        {
            char charValue = (char) (i);

            System.out.println(charValue + "=" + i);
        }
    }
}
