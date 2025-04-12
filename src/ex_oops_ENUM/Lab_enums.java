package ex_oops_ENUM;

public class Lab_enums {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());
        System.out.println("--------------------");
        System.out.println(Colors.RED.getHexcode());
        System.out.println(Colors.BLUE.getHexcode());
        System.out.println("--------------------");
        System.out.println(URLs.google.getUrl());
        System.out.println(URLs.katalon.getUrl());


    }
}
