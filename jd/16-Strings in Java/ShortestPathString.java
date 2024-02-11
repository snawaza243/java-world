import javax.print.DocFlavor.STRING;

public class ShortestPathString {

    public static float getShortestPath(String path) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }

        // int x_pow = (int) Math.pow(2, x);
        // int y_pow = (int) Math.pow(2, y);

        int x_pow = x * x;
        int y_pow = y * y;
        return (float) Math.sqrt(x_pow + y_pow);

    }

    public static void main(String[] args) {

        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));

    }
}
