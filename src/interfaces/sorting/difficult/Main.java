package interfaces.sorting.difficult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Sim sim1 = new Sim("Kyivstar", 10, 0.5, "+380968478479");
        Sim sim2 = new Sim("Vodafon", 50, 0.1, "+380685825858");
        Sim sim3 = new Sim("T-Mobile", 100, 0.3, "+380986825858");
        Sim sim4 = new Sim("Kuiv", 5, 0.2, "+380668445959");
        Sim sim5 = new Sim("Deutsch", 15, 0.1, "+380965445959");
        Sim sim6 = new Sim("UltraMobile", 20, 0.1, "+380688888181");

        Phone phone1 = new Phone("Apple", "IPhone 14 Pro Max", 12341231231445l,1100.99, new Date(2022-1900, 9, 15), sim1, 2 );
        Phone phone2 = new Phone("Apple", "IPhone 15 Pro Max", 89172398712987l,1500, new Date(2023-1900, 9, 15), sim2, 2 );
        Phone phone3 = new Phone("XIAOMI", "100Pro Max Turbo", 12398123981732l,250.99, new Date(2023-1900, 5, 27), sim3, 3 );
        Phone phone4 = new Phone("XIAOMI", "TUBRO PROSHKA 100", 534759032845903L,777.99, new Date(2020-1900, 11, 23), sim4, 4 );
        Phone phone5 = new Phone("Samsung", "S11", 88539487987129837l,1300, new Date(2022-1900, 2, 1), sim5, 5 );
        Phone phone6 = new Phone("Apple", "IPhone 13 Pro Max", 9890664590908902l,1100.99, new Date(2021-1900, 4, 6), sim6, 2 );

        Collections.addAll(phones, phone1, phone2, phone3, phone4, phone5, phone6);
        Collections.sort(phones);
        for (int i = 0; i < phones.size() ; i++) {
            System.out.println(phones.get(i) + "\n---------------------");
        }
    }
}
