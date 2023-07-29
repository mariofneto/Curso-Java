import java.util.Locale;
import java.util.Scanner;

public class oop {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*
        // exemplo com o Triangle

            Triangle x, y;

            System.out.println("Enter the measures of triangle X:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            System.out.println("Enter the measures of triangle Y:");
            double d = sc.nextDouble();
            double e = sc.nextDouble();
            double f = sc.nextDouble();

            x = new Triangle(a, b, c);
            y = new Triangle(d, e, f);

            x.exibirArea();
            y.exibirArea();
        */

        // products

        Product pd = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        pd.name = sc.nextLine();
        System.out.print("Price: ");
        pd.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        pd.quantity = sc.nextInt();
        System.out.println(" ");

        double quantityValueStock = pd.TotalValueInStock();

        System.out.println("Product Data: "+  pd.toString());

        System.out.print("Enter the number of products to be added in stock: ");
        int addNumberProducts = sc.nextInt();
        pd.addProducts(addNumberProducts);
        System.out.println("Updated Data: "+ pd.toString());

        System.out.print("Enter the number of products to be remove from stock: ");
        int removeNumberProducts = sc.nextInt();
        pd.removeProducts(removeNumberProducts);
        System.out.println("Updated Data: "+ pd.toString());

        sc.close();




    }

}
