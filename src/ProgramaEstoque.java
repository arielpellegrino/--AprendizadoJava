import java.util.Locale;
import java.util.Scanner;

public class ProgramaEstoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enteder Product data: ");
        System.out.print("name: ");
        product.name = sc.nextLine();
        System.out.print("Price :");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data" + product);
        System.out.println("Enter the number of products to be added in stock: ");

        int quantity = sc.nextInt();
    }
}
