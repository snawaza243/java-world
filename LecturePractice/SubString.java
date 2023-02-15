public class SubString {

    static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("(" +arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int myArray[] = { 1, 2, 3, 4 };
        subArray(myArray);
    }
}
