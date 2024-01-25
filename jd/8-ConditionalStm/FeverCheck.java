
public class FeverCheck {
    public static void main(String[] args) {
        double tmep = 103.5;
        String rs = (tmep <= 100) ? "You don't have a fever" : "You have a fever";
        System.out.println(rs);
    }
}
