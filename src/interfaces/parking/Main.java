package interfaces.parking;

public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking();
        BMWX5 bmwx5 = new BMWX5();
        BMWX6 bmwx6 = new BMWX6();
        Maserati maserati = new Maserati();
        Ferrari ferrari = new Ferrari();
        G_Class gClass = new G_Class();
        parking.dispetch(bmwx5);
        parking.dispetch(bmwx6);
        parking.dispetch(maserati);
        parking.dispetch(ferrari);
        parking.dispetch(gClass);
        System.out.println(parking);
    }
}
