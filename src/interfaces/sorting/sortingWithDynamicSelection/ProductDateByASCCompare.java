package interfaces.sorting.sortingWithDynamicSelection;

import java.util.Comparator;

public class ProductDateByASCCompare implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2){
        return Integer.compare(product1.getDate(), product2.getDate());
    }
}
