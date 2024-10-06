package glab_303_03_01;

public class ConcatDemo {
    public static void main(String[] args) {
        String s1 = "Learn ";
        String s2 = "Java";
        System.out.println(s1.concat(s2));
        System.out.println(s2.concat(s1));

        String s3 = "Hello";
        String s4 = "Learners";
        String s5 = s3 + s4; // the same as s3.concat(s4)

        String message = "welcome" + " to " + "java";
        String s = "Chapter" + 2;
        String s6 = "Supplement" + 'B';

        System.out.println("message:- " + message);
        System.out.println("s5:- " + s5);
        System.out.println("s:- " + s);
        System.out.println("s6:- " + s6);

    }
}
