package ex_01_Java_Basic;

public class Lab008_task_CLIandternary {
    public static void main(String[] args) {
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        System.out.println(value1>value2?"value1 is max "+value1:"value2 is max "+value2);
        // output will be
        // value1 is max 110
    }
}
