package Java_tasks;

public class Lab_task_Pyramid_pattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print("b");
            }

            // Print stars
            for (int z = 1; z <= (2 * i-1); z++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();

        }

        System.out.println("----------------------------------------------");
        for (int i=rows ;i>=1 ;i--)
        {
                  for (int j=rows;j>i;j--)
                {
                      System.out.print("b");
                }
                    for (int z=1;z<=(2*i-1);z++)
                     {
                        System.out.print("*");
                     }
            System.out.println();

        }
    }
}
