package interfaces.sorting.sortingWithDynamicSelection;

import java.util.Comparator;

public class ProductBarcodeByASCCompare implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2){
        return Long.compare(product1.getBarcode(), product2.getBarcode());
    }
}
