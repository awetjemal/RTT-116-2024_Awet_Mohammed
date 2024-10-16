package module_303_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {
    private List<Product> products = new ArrayList<Product>();
    private List<Product> cart = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    public  void  addProductToCart() {
        //cart.add(p);
        //display items for sale
        printProductsMenu();
        //prompt user to enter item number to buy
        int choice = input.nextInt();
        input.nextLine();

        //add to the cart array
        Product p = products.get(choice - 1);
        cart.add(p);
        System.out.println("Added " + p.getProductName());
        //how many do you want to buy
        //make adjustment to quantity on product

    }
    public void checkout(){
        System.out.println("Items in your carts===: ");
        //list items in tne cart
        for(Product p : cart){
            System.out.println(p.getProductName() + "  " + p.getPrice());
        }
        //System.out.println();
        //calculate tax
        //calculate total amount

    }

    public void start(){
        intiProducts();
        while(true){
            int choice = printMainMenu();
            if(choice == 1){
                printProductsMenu();
            }else if(choice == 2){
                //purchase product method to be defined yet -add item to a cart
                addProductToCart();
            }else if (choice == 3){
                //checkout method to be defined and called yet
                checkout();
            }
            else if(choice == 4){
                //exit
                System.out.println("Good Bye");
                System.exit(0);
            }else {
                System.out.println("Invalid choice");
            }

        }
        //printProductsMenu();
    }
    private void printProductsMenu(){
        for(int i = 0; i<products.size(); i++){
            Product p = products.get(i);
            System.out.println(i+1 + ") " + p.getProductName() + "\t " + p.getPrice());
        }
    }
    private int printMainMenu(){
        System.out.println("\nWelcome to Coffee Shop!");
        System.out.println("1. See product menu");
        System.out.println("2. Purchase product");
        System.out.println("3. Checkout ");
        System.out.println("4. Exit");

        System.out.print("\nEnter your choice: ");

        return input.nextInt();
    }
    private void intiProducts(){
        Product p1 = new Product("Small Coffee", 4.57, 0);
        products.add(p1);
        Product p2 = new Product("Large Coffee", 7.99, 0);
        products.add(p2);
        Product p3 = new Product("Cookie", 5.99, 0);
        products.add(p3);
        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);
    }
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        coffeeShop.start();
    }
}
