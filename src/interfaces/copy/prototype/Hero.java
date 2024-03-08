package interfaces.copy.prototype;

import java.util.ArrayList;
import java.util.HashMap;

public class Hero implements Prototype{
    private String name;
    private int age;
    private int stamina;
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private HashMap<Potion, Integer> potionHashMap = new HashMap<>();
    public Hero(String name, int age, int stamina){
        this.name = name;
        this.age = age;
        this.stamina = stamina;
    }
    @Override
    public String toString(){
        String heroInfo = "Name - " + name + "\n" + "Age - " + age + "\n" + "Stamina - " + stamina;
        String weaponInfo = "";
        String potionInfo = "";
        for (int i = 0; i < weapons.size(); i++) {
            weaponInfo += weapons.get(i) + "\n";
        }
        for (Potion potion : potionHashMap.keySet()) {
            potionInfo += potion + " - " + potionHashMap.get(potion) + "\n";
        }
        return heroInfo + "\n" + weaponInfo + "\n" + potionInfo;
    }
    public void addWeapon(Weapon weapon){
        if (!weapons.contains(weapon)){
            weapons.add(weapon);
        }
    }
    public void addPotion(Potion potion){
        if (!potionHashMap.containsKey(potion)){
            potionHashMap.put(potion, 1);
        } else {
            potionHashMap.replace(potion, potionHashMap.get(potion)+1);
        }
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
    @Override
    public Hero copy(){
        Hero hero = new Hero(name, age, stamina);
        for (int i = 0; i < weapons.size(); i++) {
            hero.addWeapon(weapons.get(i).copy());
        }
        for (Potion potion : potionHashMap.keySet()) {
            hero.addPotion(potion);
        }
        return hero;
    }
}
