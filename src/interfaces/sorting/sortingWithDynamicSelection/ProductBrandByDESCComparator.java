package interfaces.sorting.sortingWithDynamicSelection;
import java.util.Comparator;
public class ProductBrandByDESCComparator implements Comparator<Product>{
    @Override
    public int compare(Product product1, Product product2){
        return -product1.getBrand().compareTo(product2.getBrand());
    }
}
