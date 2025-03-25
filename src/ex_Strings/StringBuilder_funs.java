package ex_Strings;

public class StringBuilder_funs {
    public static void main(String[] args) {
        /*
        StringBuilder in Java is a mutable sequence of characters, used to create and manipulate strings more
        efficiently than String when many modifications are involved.
         */
        StringBuilder sb = new StringBuilder("Hello");
        //1. append(String str)
        //Adds a string (or other data type) to the end.
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World
        //2. insert(int offset, String str)
        //Inserts the string at the specified position.
        sb.insert(5, ",");
        System.out.println(sb);  // Output: Hello, World
        //replace(int start, int end, String str)
        //Replaces the characters between start (inclusive) and end (exclusive) with the given string
        sb.replace(6, 11, "Java");
        System.out.println(sb);  // Output: Hello, Java
        //delete(int start, int end)
        //Deletes characters between start (inclusive) and end (exclusive).
        sb.delete(5, 6);
        System.out.println(sb);  // Output: Hello Java
        //deleteCharAt(int index)
        //Deletes the character at the specified index.
        sb.deleteCharAt(5);
        System.out.println(sb);  // Output: HelloJava
        //reverse()
        //Reverses the characters in the builder.
        sb.reverse();
        System.out.println(sb);  // Output: avaJolleH
        //toString()
        //Converts the StringBuilder to a regular String.
        String result = sb.toString();
        System.out.println(result);
        //length()
        //Returns the current length (number of characters).
        int len = sb.length();
        System.out.println(len);
        //charAt(int index)
        //Returns the character at the specified index.
        char c = sb.charAt(0);
        System.out.println(c);
        //setCharAt(int index, char ch)
        //Sets the character at a given index.
        sb.setCharAt(0, 'h');
        System.out.println(sb);  // Output: havaJolleH
        //capacity()
        //Returns the current capacity (not the length) of the builder.
        int cap = sb.capacity();
        System.out.println(cap);
        //ensureCapacity(int minimumCapacity)
        //Ensures that the capacity is at least equal to the given value.
        sb.ensureCapacity(50);

    }
}
