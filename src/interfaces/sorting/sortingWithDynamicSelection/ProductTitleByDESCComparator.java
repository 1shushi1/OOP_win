package interfaces.sorting.sortingWithDynamicSelection;

import java.util.Comparator;

public class ProductTitleByDESCComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2){
        return -product1.getTitle().compareTo(product2.getTitle());
    }
}
