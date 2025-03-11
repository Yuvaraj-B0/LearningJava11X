package ex_01_Java_Basic;

public class Lab003_task_Printf {
    public static void main(String[] args) {
        int table = 9;
        //this the task of today to print 9 table using printf
        System.out.println("This done by using just printf");
        System.out.printf("Table of 9X1 = %d\n",table);
        System.out.printf("Table of 9X2 = %d\n",table*2);
        System.out.printf("Table of 9X3 = %d\n",table*3);
        System.out.printf("Table of 9X4 = %d\n",table*4);
        System.out.printf("Table of 9X5 = %d\n",table*5);
        System.out.printf("Table of 9X6 = %d\n",table*6);
        System.out.printf("Table of 9X7 = %d\n",table*7);
        System.out.printf("Table of 9X8 = %d\n",table*8);
        System.out.printf("Table of 9X9 = %d\n",table*9);
        System.out.printf("Table of 9X10 = %d\n",table*10);
        //this the task of today to print 9 table using printf and using for loop

        System.out.println("\nThis done by using for loop for table 9");
        for(int a=1;a<=10;a++)
        {
            int temp=table*a;
            System.out.printf("Table of 9X%d = %d\n",a,temp);
        }

    }
}
