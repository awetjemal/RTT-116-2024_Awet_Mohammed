package glab_303_11_01;

public class MyRunner {
    public static void main(String[] args) {

        GenericsDemo gd = new GenericsDemo();
        gd.genericMethod(25);
        gd.genericMethod("per scholas");
        gd.genericMethod(34.232);

        // initialize generic class
        // with String and Integer data

        MultipleDatatype<String, Integer> mobj = new MultipleDatatype<>("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        MultipleDatatype<String, String> mobj2 = new MultipleDatatype<>("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

    }
}
