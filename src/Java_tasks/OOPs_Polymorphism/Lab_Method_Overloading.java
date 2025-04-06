package Java_tasks.OOPs_Polymorphism;

public class Lab_Method_Overloading {
    public static void main(String[] args) {
        Addition A = new Addition();
        int n1 = A.add(5,5);
        int n2 = A.add(5,10,15);
        double n3 = A.add(6.5,7.8);
        System.out.println(n1+" || "+n2+" || "+n3);
    }
}
class Addition{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
