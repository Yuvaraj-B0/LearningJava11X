package Java_tasks;

import java.util.Scanner;

public class Lab_010_task_Triangle_Classifier {
    public static void main(String[] args) {
        /*
         write me program in java Write a program that classifies a triangle based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal), or scalene (no sides are equal).
          Use an if-else statement to classify the triangle.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side 1: ");
        int side1=sc.nextInt();
        System.out.println("Enter the length of side 2: ");
        int side2=sc.nextInt();
        System.out.println("Enter the length of side 3: ");
        int side3=sc.nextInt();
        // Check if input forms a valid triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            /*This uses the Triangle Inequality Theorem, which states that for three sides to form a valid triangle:
              The sum of any two sides must be greater than the third side.
              If this condition fails, the given side lengths do not form a triangle.*/
            if (side1 == side2 && side2 == side3){ /*If all three sides are equal, it's an Equilateral Triangle.*/
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3){
                /*If only two sides are equal, it's an Isosceles Triangle.*/
                System.out.println("The triangle is Isosceles.");
            } else { /*If all sides are different, it's a Scalene Triangle.*/
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given lengths do not form a valid triangle.");
        }
        sc.close();
    }
}
