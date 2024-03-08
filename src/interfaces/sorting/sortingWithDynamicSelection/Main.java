package interfaces.sorting.sortingWithDynamicSelection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        Collections.addAll(products,
                new Product("Brand1", "Name1", 2021, 29.99, 1234567890123L, 0.5, 10.0),
                new Product("Brand2", "Name2", 2022, 39.99, 2345678901234L, 0.7, 15.0),
                new Product("Brand3", "Name3", 2021, 19.99, 3456789012345L, 0.6, 12.0),
                new Product("Brand1", "Name4", 2023, 29.99, 1234567890123L, 0.5, 10.0),
                new Product("Brand4", "Name5", 2018, 29.99, 4567890123456L, 0.8, 18.0),
                new Product("Brand2", "Name6", 2019, 39.99, 2345678901234L, 0.7, 15.0),
                new Product("Brand5", "Name7", 2019, 59.99, 5678901234567L, 1.0, 20.0),
                new Product("Brand3", "Name8", 2023, 19.99, 3456789012345L, 0.6, 12.0),
                new Product("Brand1", "Name9", 2020, 69.99, 6789012345678L, 1.2, 22.0),
                new Product("Brand4", "Name10", 2018, 49.99, 4567890123456L, 0.8, 18.0),
                new Product("Brand2", "Name11", 2021, 79.99, 7890123456789L, 1.5, 25.0),
                new Product("Brand5", "Name12", 2020, 59.99, 5678901234567L, 1.0, 20.0),
                new Product("Brand3", "Name13", 2020, 89.99, 8901234567890L, 1.8, 28.0));

        ProductBrandByASCComparator productBrandByASCComparator = new ProductBrandByASCComparator();
        ProductBrandByDESCComparator productBrandByDESCComparator = new ProductBrandByDESCComparator();
        ProductTitleByASCComparator productTitleByASCComparator = new ProductTitleByASCComparator();
        ProductTitleByDESCComparator productTitleByDESCComparator = new ProductTitleByDESCComparator();
        ProductDateByASCCompare productDateByASCCompare = new ProductDateByASCCompare();
        ProductDateByDESCCompare productDateByDESCCompare = new ProductDateByDESCCompare();
        ProductPriceByASCCompare productPriceByASCCompare = new ProductPriceByASCCompare();
        ProductPriceByDESCCompare productPriceByDESCCompare = new ProductPriceByDESCCompare();
        ProductBarcodeByASCCompare productBarcodeByASCCompare = new ProductBarcodeByASCCompare();
        ProductBarcodeByDESCCompare productBarcodeByDESCCompare = new ProductBarcodeByDESCCompare();
        ProductWeightByASCCompare productWeightByASCCompare = new ProductWeightByASCCompare();
        ProductWeightByDESCCompare productWeightByDESCCompare = new ProductWeightByDESCCompare();
        ProductSizeByASCCompare productSizeByASCCompare = new ProductSizeByASCCompare();
        ProductSizeByDESCCompare productSizeByDESCCompare = new ProductSizeByDESCCompare();

        while (true) {
            System.out.println("Select a number from the list");
            System.out.println("1 - Brand ASC\n2 - Brand DESC\n3 - Title ASC\n4 - Title DESC" +
                    "\n5 - Date ASC\n6 - Date DESC\n7 - Price ASC\n8 - Price DESC\n9 - Barcode ASC" +
                    "\n10 - Barcode DESC\n11 - Weight ASC\n12 - Weight DESC\n13 - Size ASC\n14 - Size DESC\n15 - Exit");
            int sel = s.nextInt();
            switch (sel) {
                case 1:
                    Collections.sort(products, productBrandByASCComparator);
                    break;
                case 2:
                    Collections.sort(products, productBrandByDESCComparator);
                    break;
                case 3:
                    Collections.sort(products, productTitleByASCComparator);
                    break;
                case 4:
                    Collections.sort(products, productTitleByDESCComparator);
                    break;
                case 5:
                    Collections.sort(products, productDateByASCCompare);
                    break;
                case 6:
                    Collections.sort(products, productDateByDESCCompare);
                    break;
                case 7:
                    Collections.sort(products, productPriceByASCCompare);
                    break;
                case 8:
                    Collections.sort(products, productPriceByDESCCompare);
                    break;
                case 9:
                    Collections.sort(products, productBarcodeByASCCompare);
                    break;
                case 10:
                    Collections.sort(products, productBarcodeByDESCCompare);
                    break;
                case 11:
                    Collections.sort(products, productWeightByASCCompare);
                    break;
                case 12:
                    Collections.sort(products, productWeightByDESCCompare);
                    break;
                case 13:
                    Collections.sort(products, productSizeByASCCompare);
                    break;
                case 14:
                    Collections.sort(products, productSizeByDESCCompare);
                    break;
                case 15 :
                    System.exit(0);
                default:
                    System.out.println("Invalid selection");
            }
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i));
            }
        }
    }
}
