package ex_oops_ENUM;

public enum Locators  {
    page_button("#btn"),
    page_input("#input1");

    private String Locators;

    Locators(String Loc){
        this.Locators = Loc;
    }

    String getLocators(){
        return this.Locators;
    }
}