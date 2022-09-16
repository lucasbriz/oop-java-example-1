import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("ENTER PRODUCT DATA: \n");
        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price: R$ ");
        product.price = scanner.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        //Printed results using printf instead the instance.toString
        //System.out.printf("Name: %s, Price: R$ %.2f, Quantity: %d", product.name, product.price, product.quantity);

        //Print using .toString
        System.out.println("Product Data: " + product + "\n");

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated Data: " + product + "\n");

        System.out.print("Enter the number of products to be removed in stock: ");
        int quantityRemove = scanner.nextInt();
        product.removeProducts(quantityRemove);

        System.out.println("Updated Data: " + product + "\n");

        scanner.close();
    }
}