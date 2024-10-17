package pa_303_10_03;

public class KidUser implements LibraryUser{

    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if(age <= 11)
            System.out.println("You have successfully registered under a Kids account");
        else
            System.out.println("Sorry, age must be less than 12 to register as a Kid");
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Kids"))
            System.out.println("Book issued successfully, please return the book with in 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
