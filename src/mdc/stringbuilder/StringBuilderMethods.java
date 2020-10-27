package mdc.stringbuilder;

public class StringBuilderMethods {
    public static void main(String[] args) {
        // chatAt, indexOf, length, substring
        // 0   1   2    3    4   5   6    7   8   9    10
        // p   r   o    g    r   a   m    m   i   n    g

        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi")); // (3, 7)
        int len = sb.length();
        char ch = sb.charAt(5);
        System.out.println(sub + ", " + len + ", " + ch); // returns gram, 11, a

        // append
        StringBuilder b = new StringBuilder().append(1).append("L");
        b.append("-").append(true);
        System.out.println(b); // returns 1L-true

        StringBuilder builder = new StringBuilder("programming");
        System.out.println(builder);
        builder.insert(7, "-");
        builder.insert(2, 2);
        System.out.println(builder); // returns pr2ogram-ming

        //delete, deleteCharAt
        builder.delete(4, 9); // removing all character from 4 to 8, 9 not included
        System.out.println(builder); // returns pr2oming
        builder.deleteCharAt(2); // returns proming
        System.out.println(builder);
        builder.delete(1, 2); // this will delete char at position 1 only
        //builder.delete(2, 1); this will not compile, it will throw an exception
        System.out.println(builder); // returns p2oming

        builder.delete(4, 4); // this does not change anything
        System.out.println(builder);

        // reverse
        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println(sb1);


        String myString = sb1.toString();
        myString = myString.toLowerCase();
        System.out.println("myString = " + myString); // returns myString = 321cba



    }
}
