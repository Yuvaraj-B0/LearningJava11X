package ex_Execption;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_Throws {
    public static void main(String[] args) throws FileNotFoundException,Exception {
      try {
          FileInputStream fileInputStream = new FileInputStream("C://a.log");
      } catch (FileNotFoundException e) {
          System.out.println(e.getMessage());
      }
        String s1 = null;
        try {
            s1.trim();
            int a = 10/0;
            File file = new File("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void t() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C://a.log");
    }
}