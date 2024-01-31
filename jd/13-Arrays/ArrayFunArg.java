public class ArrayFunArg {

    public static void update(int marks[], int y) {
        y++;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        // int[] arr = new int[5];

        int marks[] = { 97, 98, 99 };
        int x = 10;

        update(marks, x);

        for (int i = 0; i < marks.length; i++) {
            System.obut.print(marks[i] + " ");
        }

    }
}
