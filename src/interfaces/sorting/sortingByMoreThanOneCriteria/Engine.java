package interfaces.sorting.sortingByMoreThanOneCriteria;

public class Engine {
    private String brand;
    private double volume;
    private int horsePowers;
    public Engine(String brand, double volume, int horsePowers){
        this.brand = brand;
        this.volume = volume;
        this.horsePowers = horsePowers;
    }
    public String getBrand(){
        return brand;
    }
    @Override
    public String toString(){
        return "Engine brand : " + brand + "\nVolume : " + volume + "\nHorse powers : " + horsePowers;
    }
}
