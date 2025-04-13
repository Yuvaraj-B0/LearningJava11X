package ex_Generics;

public class Lab_Generics_Method {
    public static void main(String[] args) {

        temp_sum(3,4);
        temp_sum(3.34,4.45);
        temp_sum("Pramod","Dutta");


    }

    static <G> G temp_sum(G a, G b){
        System.out.println(a);
        System.out.println(b);
        System.out.println("=============");
      //  System.out.println(a+b); //Operator '+' cannot be applied to 'G', 'G'
        return null;
    }
}
