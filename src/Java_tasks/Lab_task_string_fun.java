package Java_tasks;

public class Lab_task_string_fun {
    public static void main(String[] args) {
        String st="Dump";
        StringBuffer stb =new StringBuffer(st);
        System.out.println(st);
        System.out.println(stb.reverse());
        System.out.println(st.equalsIgnoreCase(String.valueOf(stb)));

        System.out.println(st.length());
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.concat("E"));

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

        String name = "DumpTest";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // StringIndexOutOfBoundsException

        // 2. concat()
        System.out.println(name.concat("String"));

        // 3. contains()
        System.out.println(name.contains("Te"));

        // 4. equals()
        System.out.println(name.equals("DumpTest"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("dumpteststring"));

        // 6. indexOf() //  sonal -> ? o
        System.out.println(name.indexOf('o'));

        String s = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s.indexOf("m"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 9. split()

        String name4 = "pramod@live.com@123";
        String[] split = name4.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        // 16. trim()
        String name3 = "DumpTest";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("DumpTest"));


        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi23");
        System.out.println(sb.toString());


        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "Pramod";
        String s21 = s11.concat("Dutta");
        System.out.println(s21);

//        Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1);



        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));
    }
}
