package glab_303_11_01;

public class GenericsDemo {
    //create generic method
    public <T> void genericMethod(T data) {
        System.out.println("Generic Method");
        System.out.println("Data passed: " + data);
    }
}
