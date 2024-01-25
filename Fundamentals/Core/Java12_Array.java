public class Java12_Array {
    public static void main(String[] args) {
        // arra Declare
        int myNum[] = { 12, 34, 45, 23 };
        String myPhone[] = { "Apple", "Samsung", "Nokia", "Vivo" };

        // access array element
        System.out.println("Num data at 2: " + myNum[2]);
        System.out.println("Str data at 3: " + myPhone[3]);

        // changing array element
        myPhone[3] = "Vivo Y12";
        System.out.println("Str New data at 3: " + myPhone[3]);

        // array length
        System.out.println("Num length: " + myNum.length);
        System.out.println("Str length: " + myPhone.length);

        // array length new way
        String myStrArrayLength[] = new String[] { "StrData1", "StrData2", "StrData3" };
        var outSize = myStrArrayLength.length;
        System.out.println("My Str Length: " + outSize);

        // for loop and array elements
        System.out.println("Array elements for-loop");
        for (int i = 0; i < myNum.length; i++) {
            System.out.println(myNum[i]);
        }

        for (int j = 0; j < myPhone.length; j++) {
            System.out.println(myPhone[j]);
        }

        // for-each loop for array elements
        System.out.println("Array elements for-each");
        for (int i : myNum) {
            System.out.println(i);
        }

        for (String j : myPhone) {
            System.out.println(j);
        }

        // multidimensional array
        int myTable[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        System.out.println(myTable[1][3]); // 1

        // change multi-d array element value
        myTable[1][3] = 9;
        System.out.println(myTable[1][3]); //9

        // loop through multi-d array element value

        for(int i=0; i<myTable.length; i++)
        {
            for(int j=0; j<myTable[i].length; j++)
            {
                System.out.print(myTable[i][j]);
            }
            System.out.println();
        }

    }
}
