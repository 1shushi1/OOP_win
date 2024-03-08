package coffeeMachine;
import java.util.Scanner;

public class CoffeeMaker {
    private double currentMilkVolume;
    private double currentWaterVolume;
    private double currentCoffeeVolume;
    private double maxMilkVolume;
    private double maxWaterVolume;
    private double maxCoffeeVolume;
    private boolean isOn;
    private Scanner s = new Scanner(System.in);
    public CoffeeMaker(double maxMilkVolume, double maxCoffeeVolume, double maxWaterVolume){
        this.maxMilkVolume = maxMilkVolume;
        this.maxCoffeeVolume = maxCoffeeVolume;
        this.maxWaterVolume = maxWaterVolume;
        this.currentWaterVolume = maxWaterVolume;
        this.currentCoffeeVolume = maxCoffeeVolume;
        this.currentMilkVolume = maxMilkVolume;
        menu();
    }
    private void onOff(){
        System.out.println((isOn = !isOn) ? "Turned on" : "Turned Off");
    }
    private void createDrink(){
        if (getOn() == true) {
            System.out.println("Select a drink you would like to make : 1 - Americano, 2 - Latte, 3 - Americano + Milk");
            int selection = s.nextInt();
            switch (selection) {
                case 1:
                    americano();
                    break;
                case 2:
                    latte();
                    break;
                case 3:
                    americanoWithMilk();
                    break;
            }
        } else {
            System.out.println("In order to make a coffee you have to turn on a coffee machine first");
        }
    }
    private void americano(){
        if (getCurrentWaterVolume() >= 60){
            setCurrentWaterVolume(getCurrentWaterVolume() - 60);
        } else {
            System.out.println("We've run out of water");
            return;
        }
        if (getCurrentCoffeeVolume() >= 30){
            setCurrentCoffeeVolume(getCurrentCoffeeVolume() - 30);
        } else {
            System.out.println("We've run out of coffee");
            return;
        }
        System.out.println("You've successfully made an americano. Enjoy :)");
    }
    private void latte(){
        if (getCurrentMilkVolume() >= 170){
            setCurrentMilkVolume(getCurrentMilkVolume() - 170);
        } else {
            System.out.println("We've run out of milk");
            return;
        }
        if (getCurrentCoffeeVolume() >= 20){
            setCurrentCoffeeVolume(getCurrentCoffeeVolume() - 20);
        } else {
            System.out.println("We've run out of coffee");
            return;
        }
        System.out.println("You've successfully made latte. Enjoy :)");
    }
    private void americanoWithMilk(){
        if (getCurrentCoffeeVolume() >= 30){
            setCurrentCoffeeVolume(getCurrentCoffeeVolume() - 30);
        } else {
            System.out.println("We've run out of milk");
            return;
        }
        if (getCurrentWaterVolume() >= 60){
            setCurrentWaterVolume(getCurrentWaterVolume() - 60);
        } else {
            System.out.println("We've run out of water");
            return;
        }
        if (getCurrentMilkVolume() >= 30){
            setCurrentMilkVolume(getCurrentMilkVolume() - 30);
        } else {
            System.out.println("We've run out of milk");
            return;
        }
        System.out.println("You've successfully made an americano with milk. Enjoy :)");
    }
    private void menu(){
        while (true){
        System.out.println("Select : 1 - Turn On/Off, 2 - Make drink, 3 - Fill coffee machine with products, 4 - Exit");
        int selection = s.nextInt();
        switch (selection) {
            case 1 -> onOff();
            case 2 -> createDrink();
            case 3 -> productsFiller();
            case 4 -> System.exit(0);
            }
        }
    }
    private void productsFiller(){
        System.out.println("Select a product you would like to refill : 1 - Coffee, 2 - Water, 3 - Milk");
        int selection = s.nextInt();
        switch (selection){
            case 1 : setCurrentCoffeeVolume(maxCoffeeVolume - currentCoffeeVolume);
                System.out.println("You've successfully refill coffee");
                break;
            case 2 : currentMilkVolume -= maxMilkVolume;
                System.out.println("You've successfully refill milk");
                break;
            case 3 : currentWaterVolume -= maxWaterVolume;
                System.out.println("You've successfully refill water");
                break;
        }
    }
    public double getCurrentMilkVolume(){
        return currentMilkVolume;
    }
    public double getCurrentWaterVolume(){
        return currentWaterVolume;
    }
    public double getCurrentCoffeeVolume(){
        return currentCoffeeVolume;
    }
    public boolean getOn(){
        return isOn;
    }
    public void setCurrentMilkVolume(double currentMilkVolume){
        this.currentMilkVolume = currentMilkVolume;
    }
    public void setCurrentWaterVolume(double currentWaterVolume){
        this.currentWaterVolume = currentWaterVolume;
    }
    public void setCurrentCoffeeVolume(double currentCoffeeVolume){
        this.currentCoffeeVolume = currentCoffeeVolume;
    }
}
