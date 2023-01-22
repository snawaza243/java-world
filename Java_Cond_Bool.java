public class Java_Cond_Bool {
    public static void main(String[] args) {
        // Java conditional statement

        int a = 12, b = 23;

        // 1. boolean
        System.out.println("\nJava Boolean");
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // Outputs true
        System.out.println(isFishTasty);

        int num1 = 12;
        int num2 = 23;
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 == num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        int my_age = 22;
        int age_num = 18;
        if (my_age >= age_num) {
            System.out.println("You can go");
        } else {
            System.out.println("You cant go");
        }

        // 2. if else
        System.out.println("\nJava If... Else");
        int num3 = 2;
        if (num3 == 1) {
            System.out.println("I like you");
        } else {
            System.out.println("I don't know");
        }

        int time = 11;
        if (time < 12) {
            System.out.println("Good Morning");
        } else if (time > 12 & time < 4) {
            System.out.println("Good Afternoon");
        } else if (time > 4 & time < 6) {
            System.out.println("Good evening");
        }

        // ternary operator
        int time2 = 12;
        // String resault = (time2 < 18) ? "Good day." : "Good evening";
        System.out.println((time < 18) ? "Good day." : "Good evening");

        if (time2 < 18) {
            System.out.println("Good day");
        } else {
            System.out.println("Good evening");
        }

        // 3. switch
        System.out.println("\nJava Switch");
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                // break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number");
                break;
        }

        // 4. while loop
        System.out.println("\nJava While Loop");

        for (int num4 = 1; num4 < 6; num4++) {
            System.out.println("for loop" + num4);
        }

        int num5 = 1;
        while (num5 < 6) {
            System.out.println("while loop: " + num5);
            num5++;
        }

        int num6 = 0, num66=1;
        do {
            System.out.println("do while 6: " + num6);
            num6++;
        } 
        while(num6<10);




    }
}
