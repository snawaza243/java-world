public class OOPS_C_Access {
    public static void main(String[] args) {

        BankAcc myAcc = new BankAcc();

        myAcc.username = "Sam";
        System.out.println(myAcc.username);

        // cant assign or access direct
        // myAcc.password = "123";
        // System.out.println(myAcc.password);

        myAcc.setPass(1224);
        System.out.println(myAcc.getPass());

        Pen px = new Pen();
        px.name = ("Link");
        System.out.println("Pen name: " + px.name);

        px.setPrice(25);
        System.out.println("Pen Price: " + px.getPrice());

    }
}

class BankAcc {
    public String username;
    private int password;

    void setPass(int pwd) {
        this.password = pwd;
    }

    int getPass() {
        return this.password;
    }

}

class Pen {
    String name;
    String color;
    int tip;
    private int price;

    void setName(String newName) {
        this.name = newName;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

    String getName() {
        return this.name;
    }

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    int getPrice() {
        return this.price;
    }

}