package ex_01_Java_Basic;

public class Lab_006_task_decerment {
    public static void main(String[] args) {
        int a=20;
        System.out.println(--a + a++ + a--); //output 58
        /*
        --a -> ex_a = 19 and a value is 19
        a++ -> ex_b = 19 and a value is 20
        a-- -> ex_c = 20 and a value is 19
        ex_a + ex_b + ex_c = 58
         */
        System.out.println(a); //output 19
    }
}
