import java.util.Comparator;
import java.util.TreeSet;

public class ProductRunner {

    public static void main(String[] args) {
        Comparator<Product> productComparator = new ProductCountComparator().thenComparing(new ProductNameComparator());
        TreeSet<Product> products = new TreeSet<>(productComparator);
        products.add(new Product("Pen", 10));
        products.add(new Product("Pencil", 20));
        products.add(new Product("Book", 25));
        products.add(new Product("Page", 5));

        for (Object product : products) {
            System.out.println(product);
        }
    }

}