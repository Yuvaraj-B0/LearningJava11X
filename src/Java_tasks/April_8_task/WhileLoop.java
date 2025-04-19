package Java_tasks.April_8_task;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Print Number 1 To 10 : ");
        while (i<=10){
            System.out.println(+i);
            i++;
        }
        System.out.println("==================================");
        System.out.println("Print even numbers from 1 to 20");
        Integer z=1;
        while (z<=20)
        {
            if(z%2 == 0){
                System.out.println("Even : "+z);
            }
            z++;
        }
        System.out.println("==================================");
        System.out.println("Print \"Java\" 5 times");
        Integer a=1;
        while (a<=5)
        {
            System.out.println("Java");
            a++;
        }
        System.out.println("==================================");
        System.out.println("Calculate sum of first 10 natural numbers");
        Integer q = 1;
        Integer sum = 0;
        while (q <= 10){
            sum = sum + q;
            q++;
        }
        System.out.println("The Sum Of First 10 Natural Number is : " +sum);
        System.out.println("==================================");
        System.out.println("Print the multiplication table of 7");
        int table = 7;
        int s = 1;
        while (s <= 10){
            System.out.println(table+ " * " +s+ " = " +(table*s));
            s++;
        }
    }
}
