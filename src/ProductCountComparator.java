import java.util.Comparator;

public class ProductCountComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return Integer.compare(product1.getCount(), product2.getCount());
    }

}