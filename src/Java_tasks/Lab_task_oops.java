package Java_tasks;

public class Lab_task_oops {
    public static void main(String[] args) {
        Person pr = new Person();
        pr.intro();
        pr.personDetails("Testing",22,"male");
        System.out.println("the person is married "+pr.marriageDetails());
        pr.contactDetails("12345678");
        System.out.println("the moblieNO is "+pr.contactDetails(pr.mobileNo));

    }
}
class Person {
    String name;
    byte age;
    double weight;
    double height;
    String mobileNo;
    String email;
    String gender;
    String skinColor;
    boolean isMarried;
    double salary;

    void intro(){
        System.out.println("This is my introduction");
    }
    void personDetails(String name, int age, String gender){
        System.out.println("Name - "+name+"\nAge - "+age+"\nGender - "+gender);
    }
    boolean marriageDetails(){
        isMarried=false;
        return isMarried;
    }
    String contactDetails(String mobileNo){
        this.mobileNo=mobileNo;
        return mobileNo;
    }
}


