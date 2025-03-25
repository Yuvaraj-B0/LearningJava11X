package ex_Strings;

public class StringBuffer_funs {
    public static void main(String[] args) {
        //StringBuffer in Java is very similar to StringBuilder, but it's thread-safe (i.e., synchronized),
        // which makes it slightly slower but safe to use in multi-threaded environments.

        // append(String str)
        //Adds text to the end.
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World
        //insert(int offset, String str)
        //Inserts a string at the specified index.
        sb.insert(5, ",");
        System.out.println(sb);  // Output: Hello, World
        //replace(int start, int end, String str)
        //Replaces part of the string with new text.
        sb.replace(6, 11, "Java");
        System.out.println(sb);  // Output: Hello, Java
        //delete(int start, int end)
        //Removes a range of characters.
        sb.delete(5, 6);
        System.out.println(sb);  // Output: Hello Java
        //deleteCharAt(int index)
        //Deletes a single character at the given index.
        sb.deleteCharAt(5);
        System.out.println(sb);  // Output: HelloJava
        //reverse()
        //Reverses the content.
        sb.reverse();
        System.out.println(sb);  // Output: avaJolleH
        //toString()
        //Converts StringBuffer to a regular String.
        String result = sb.toString();
        System.out.println(result);
        //length()
        //Returns the number of characters.
        System.out.println(sb.length());
        //charAt(int index)
        //Gets the character at a given position.
        char ch = sb.charAt(0);
        System.out.println(ch);
        //setCharAt(int index, char ch)
        //Sets the character at the specified index.
        sb.setCharAt(0, 'A');
        System.out.println(sb);
        //capacity()
        //Shows the current capacity of the buffer.
        System.out.println(sb.capacity());
        //ensureCapacity(int minimumCapacity)
        //Ensures the buffer has at least the given capacity.
        sb.ensureCapacity(100);

    }
}
