package interfaces.sorting.differentObjectsSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Compare> comparableObjects = new ArrayList<>();
        Human human1 = new Human("Sasha", 80, new Date(2005-1900, 8, 14), 187);
        Human human2 = new Human("Mykola", 65, new Date(1999-1900, 5, 23), 165);
        Human human3 = new Human("Roman", 100, new Date(1985-1900, 11, 15), 178);

        Goat goat1 = new Goat(20, new Date(2015-1900, 1, 13), 40);
        Goat goat2 = new Goat(23, new Date(2017-1900, 4, 1), 34);
        Goat goat3 = new Goat(24, new Date(2016-1900, 6, 25), 42);

        Table table1 = new Table(18, new Date(2021-1900, 11, 23), 110);
        Table table2 = new Table(10, new Date(2022-1900, 3, 12), 108);
        Table table3 = new Table(12, new Date(2023-1900, 7, 1), 100);

        Collections.addAll(comparableObjects, human1, human2, human3, goat1, goat2, goat3, table1, table2, table3);
        Collections.sort(comparableObjects);
        for (int i = 0; i < comparableObjects.size(); i++) {
            System.out.println(comparableObjects.get(i));
        }
    }
}
