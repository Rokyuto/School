package Buyable;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product(0,25,"PC");
        BetterProduct bp1 = new BetterProduct(1,20,"Laptop");

        ArrayList<Buyable> products = new ArrayList<>();
        products.add(p1);
        products.add(bp1);

        Scanner myScanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu:");
            System.out.println("1 -> Add new Product");
            System.out.println("2 -> Search for Product");
            System.out.println("3 -> Exit");
            int userChoice = myScanner.nextInt();
            switch (userChoice){
                case 1:
                    products.add(newProduct(myScanner));
                    break;
                case 2:
                    searchProduct(myScanner.next(), products);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }

    public static Product newProduct(Scanner scanner) {
        return new Product(scanner.nextInt(), scanner.nextInt(), scanner.next());
    }

    public static void searchProduct(String productName,ArrayList<Buyable> products){
        boolean isProductFound = false;
        for (Buyable currentProduct : products) {
            if (currentProduct.getName().equals(productName)){
                isProductFound = true;
                System.out.println(currentProduct.getName());
            }
        }
        if (!isProductFound){
            System.out.println("Product with this name is not found");
        }
    }
}
