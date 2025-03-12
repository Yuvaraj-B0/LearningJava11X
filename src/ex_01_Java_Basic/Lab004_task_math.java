package ex_01_Java_Basic;

public class Lab004_task_math {
    public static void main(String[] args) {
        int x=10,y=10,z=10;
       //This follow the inside of root 10^2+10^2-|10| is x^2+y^2-|z|
        //Math.pow() returns 10 power of 2 i.e 10*10
        //Math.abs returns the positive value of a number, regardless of its original sign
        double InsideRoot = Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z);
        System.out.println("Value of x^2+y^2-|z| is "+InsideRoot);
        //This follow the outside of root (3 root(x^(2)+y^(2)-|z|))
        System.out.println("value of complete formula cube root(x^(2)+y^(2)-|z|) = " +Math.cbrt(InsideRoot));
    }
}
