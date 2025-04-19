package Java_tasks.April_8_task;

public class For_loop_task {
    public static void main(String[] args) {
        System.out.println("Print the Number 1 To 10 : ");
        for (int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
        System.out.println("==================================");
        System.out.println("Print even numbers from 1 to 20");
        for (int i=1;i<=20;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("==================================");
        System.out.println("Print \"Hello\" 5 times");
        for (int i=1;i<=5;i++)
        {
            System.out.println("Hello");
        }
        System.out.println("==================================");
        System.out.println("Print the sum of first 10 natural numbers");
        Integer sum=0;
        for (int i=1;i<=10;i++)
        {
            sum=sum+i;
        }
        System.out.println("The Sum of First 10 Natural Number is : " +sum);
        System.out.println("==================================");
        System.out.println("Print the multiplication table of 5");
        Integer table = 5;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(table+ " * " +i+ " = " +(table*i));
        }
    }
}
