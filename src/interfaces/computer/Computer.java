package interfaces.computer;

import java.util.ArrayList;
import java.util.Scanner;

public class Computer{

    private ArrayList<Printable> printables = new ArrayList<>();

    public void connectPrintable(Printable p){
        printables.add(p);
        System.out.println("You've connected your device");
    }
    public void disconnectPrintable(){
        printsList();
        Scanner s = new Scanner(System.in);
        System.out.println("Select number, which device you would like to disconnect");
        int sel = s.nextInt();
        for (int i = 0; i < printables.size(); i++) {
            printables.remove(sel);
        }
        System.out.println("You've successfully disconnected a device");
    }
    public void printsList(){
        for (int i = 0; i < printables.size(); i++) {
            System.out.println(i++ + " - " + printables.get(i).getClass().getSimpleName() + "\n");
        }
    }
}
