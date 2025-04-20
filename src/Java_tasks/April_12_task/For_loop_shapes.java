package Java_tasks.April_12_task;

public class For_loop_shapes {
    public static void main(String[] args) {
        System.out.println("Right-Angled Triangle");
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Inverted Right-Angled Triangle");
        for (int i = 5; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Pyramid Pattern");
        int row=5;
        for (int i=1;i<=row;i++){
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for (int q=1;q<=2*i-1;q++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Inverted Pyramid Pattern");
        int rows=5;
        for (int i=rows;i>=1;i--){
            for (int j = 1; j <= rows-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
