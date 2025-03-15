package Java_tasks;



public class Lab_005_task_incerment {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++); //output is 34
        /* ++a -> ex_a = 11 and a value 11
           a++ -> ex_b = 11 and a value 12
           a++ -> ex_c = 12 and a value 13
           ex_a + ex_b + ex_c =34
         */
        System.out.println(a); //out put 13

    }
}
