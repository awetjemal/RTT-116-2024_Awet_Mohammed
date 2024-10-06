package glab_303_03_01;

public class Main   {
    public static void main(String[] args) {
        //8. charAt() method: Getting characters from a String
        String message = "Welcome to lesson 303";
        System.out.println("The first character in the message is " + message.charAt(0));
        System.out.println("The last character in the message is " + message.charAt(message.length()-1));

        //9. compareTo() method: compares the given string with the current string
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";
        System.out.println(s1.compareTo(s2));// returns 0 because both are equal
        System.out.println(s1.compareTo(s3));//returns -1 because l is lower than m by just 1
        System.out.println(s1.compareTo(s4));//returns 2 because h is higher than f by just 2

        //10. substring() mehtod: extracts a substring from a string and returns it
        message = "java is fun";
        System.out.println(message.substring(0, 4));//extracts string from index 0 to 3 :- java

        //11. indexOf() method: returns the index of first occurrence of the specified character of substring
        System.out.println(message.indexOf('s')); // 6
        System.out.println(message.lastIndexOf('j')); // 0
        System.out.println(message.lastIndexOf('a')); // 3
        System.out.println(message.lastIndexOf('b')); // -1 character not in the string
        System.out.println(message.lastIndexOf("ava")); // 1
        System.out.println(message.lastIndexOf("Java")); // -1 substring not in the string

        //12. contains() method: checks whether the specified string is present in the string or not
        String str = "Learn Java";
        System.out.println(str.contains("Java")); // returns true
        System.out.println(str.contains("Python")); // returns false
        System.out.println(str.contains("")); // returns true

        //13. replace() method: replaces each matching occurrence of the old character/text in the string with new
        str = "abc cba";
        System.out.println(str);
        System.out.println("All occurrence of \'a\' is replaced with \'z\' " + str.replace('a', 'z'));
        System.out.println("\"Lava\".replace(L, J): " + "Lava".replace('L', 'J') );
        System.out.println("Hello".replace('4', 'J'));//character not in the string
        System.out.println(str.replace("c++", "java"));// substring not in the string
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        //14. replaceAll() method: stringObject.replaceAll(String regex, String replacement)
        System.out.println("java123is456fun".replaceAll("\\d+", " "));// java is fun

        //15. equals() method: compares original content of the string
        s1 = "PerScholas";
        s2 = "PerScholas";
        s3 = new String("PerScholas");
        s4 = "TekSystem";
        System.out.println("----equals()-------line 54");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        //16. == operator: compares references not values
        System.out.println("---- == operator-----line 60");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false

        //17. compareTo() method: compares values lexicographically
        System.out.println("----- compareTo()-----line 65");
        s1 = "PerScholas";
        s2 = "PerScholas";
        s3 = new String("PerSchola");
        s4 = "PerScholasx";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(s1 > s3)
        System.out.println(s1.compareTo(s4));//-1(s1 < s4)



    }
}
