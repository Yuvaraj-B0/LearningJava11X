package ex_Generics;

public class Lab_Generics_Class {
    public static void main(String[] args) {
        GenericClass<Integer> intObjRef = new GenericClass(5);
        GenericClass<String> stringObjRef = new GenericClass("Pramod");
        System.out.println(intObjRef.getData());
        System.out.println(stringObjRef.getData());

        // T -> it is placeholder only -> it can be any data type.

    }
}

class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data = data;
    }

    public T getData(){
        return this.data;
    }

}
