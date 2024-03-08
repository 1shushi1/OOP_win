package interfaces.sorting.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, -1, -4, 1, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<String> name = new ArrayList<>();
        Collections.addAll(name, "Sasha", "Kolya", "Katya", "Tolya", "Vanya", "Tanya");
        Collections.sort(name);
        System.out.println(name);
        List<Integer> desc = new ArrayList<>();
        Collections.addAll(desc, 4, 5, 6, -1, -4, 1, 10);
        Collections.sort(desc);
//        for (int i = 0, j = desc.size() - 1; i < desc.size()/2; i++, j--) {
//            int temp;
//            temp = desc.get(i);
//            desc.set(i, desc.get(j));
//            desc.set(j, temp);
//        }
        Collections.reverse(desc);
        System.out.println(desc);
    }
}
