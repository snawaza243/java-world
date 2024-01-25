
public class AgeCondition {
    public static void main(String[] args) {
        int age = 24;
        if (age >= 18) {
            System.out.println("Adult: drive, vote");
        } else if (age > 13 && age < 18) {
            System.out.println("Your are teenager");
        } else {
            System.out.println("Not adult");
        }
    }
}
