package Java_tasks;

public class Lab_task_find_Second_Number_Array {
    public static void main(String[] args) {
        int[] number={45,23,86,3,56,25,76};
        int max=0;
        int se_max=0;
        for (int i=0;i<number.length;i++){
            if(number[i]>max)
            {
                se_max=max;
                max=number[i];
            } else if (number[i]>se_max && number[i]!=max) {
                se_max=number[i];
                
            }

        }
        System.out.println("First largest number is: "+max);
        System.out.println("Second largest number is: "+se_max);

    }
}
