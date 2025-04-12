package ex_oops_ENUM;

public enum URLs {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    URLs(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}