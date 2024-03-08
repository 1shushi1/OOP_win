package interfaces.sorting.sortingByMoreThanOneCriteria;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Engine engine1 = new Engine("EngineBrand1", 2.0, 150);
        Engine engine2 = new Engine("EngineBrand2", 2.5, 200);
        Engine engine3 = new Engine("EngineBrand3", 1.8, 120);

        Car car1 = new Car("Toyota", "Camry", engine1, 25000.0, 2020);
        Car car2 = new Car("Toyota", "Corolla", engine2, 20000.0, 2021);
        Car car3 = new Car("Toyota", "Rav4", engine3, 30000.0, 2019);

        Car car4 = new Car("Honda", "Accord", engine1, 26000.0, 2018);
        Car car5 = new Car("Honda", "Civic", engine2, 21000.0, 2022);
        Car car6 = new Car("Honda", "CR-V", engine3, 32000.0, 2020);

        Car car7 = new Car("Ford", "Fusion", engine1, 24000.0, 2022);
        Car car8 = new Car("Ford", "Escape", engine2, 19000.0, 2019);
        Car car9 = new Car("Ford", "Focus", engine3, 31000.0, 2021);

        Car car10 = new Car("Chevrolet", "Malibu", engine1, 25500.0, 2020);
        Car car11 = new Car("Chevrolet", "Cruze", engine2, 20500.0, 2018);
        Car car12 = new Car("Chevrolet", "Equinox", engine3, 31500.0, 2022);

        Car car13 = new Car("Nissan", "Altima", engine1, 24500.0, 2019);
        Car car14 = new Car("Nissan", "Sentra", engine2, 19500.0, 2021);
        Car car15 = new Car("Nissan", "Rogue", engine3, 32500.0, 2020);

        Collections.addAll(cars, car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13, car14, car15);
        Collections.sort(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
