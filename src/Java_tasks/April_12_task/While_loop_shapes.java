package Java_tasks.April_12_task;

public class While_loop_shapes {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Right-Angled Triangle");
        int a = 1,rows=5;
        while (a <= rows) {
            int j = 1;
            while (j <= a) {
                System.out.print("* ");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            a++;
        }
        System.out.println("==================================");
        System.out.println("Inverted Right-Angled Triangle");
        int i = rows;
        while (i > 0) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i--;
        }
        System.out.println("==================================");
        System.out.println("Pyramid Pattern");
        i = 1;
        while (i <= rows) {
            int j = 1;

            // Print leading spaces
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }

            // Print stars
            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }

            System.out.println(); // Move to the next line after each row
            i++;
        }
        System.out.println("==================================");
        System.out.println("Inverted Pyramid Pattern");
        i = rows;
        while (i>0)
        {
            int j = 1;
            while (j <= rows-i)
            {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= (2 * i - 1)) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i--;

        }

    }
}
