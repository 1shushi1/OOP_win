package interfaces.sorting.sortingWithDynamicSelection;

import java.util.Comparator;

public class ProductPriceByDESCCompare implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2){
        return -Double.compare(product1.getPrice(), product2.getPrice());
    }
}
