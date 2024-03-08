package interfaces.copy.prototype;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("James", 25, 10);
        Weapon weapon1 = new Weapon("Sword");
        Weapon weapon2 = new Weapon("Knife");
        Weapon weapon3 = new Weapon("Hex");
        Potion potion1 = new Potion("Heal", "Heal");
        Potion potion2 = new Potion("Stamina", "Stamina");
        Potion potion3 = new Potion("SuperPower", "SuperPower");
        Potion potion4 = new Potion("NoFatigue", "Anti-sleep");
        hero.addPotion(potion1);
        hero.addPotion(potion2);
        hero.addPotion(potion3);
        hero.addPotion(potion4);
        hero.addWeapon(weapon1);
        hero.addWeapon(weapon2);
        hero.addWeapon(weapon3);
        System.out.println(hero);
        hero.setStamina(15);
        System.out.println(hero);
        Hero heroCopy = hero.copy();
        System.out.println("Hero copy \n" + heroCopy);
        System.out.println("___________");
        Weapon weaponCopy = new Weapon("Pistol");
        heroCopy.addWeapon(weaponCopy);
        System.out.println(hero);
        System.out.println("Hero copy");
        System.out.println(heroCopy);
        System.out.println("____________");
        System.out.println(hero);
        System.out.println(heroCopy);
        weapon1.brake();
        System.out.println("________");
        System.out.println(hero);
        System.out.println(heroCopy);
    }
}
