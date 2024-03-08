package interfaces.copy.prototype;

public class Weapon implements Prototype{
    private String name;
    private boolean isOk = true;
    public Weapon(String name){
        this.name = name;
    }
    @Override
    public int hashCode(){
        int hashCode = 81;
        hashCode = 81 * hashCode + name.hashCode();
        return hashCode;
    }
    @Override
    public boolean equals(Object object){
        if (object == this){
            return true;
        }
        if (object == null){
            return false;
        }
        if (!(object instanceof Weapon)){
            return false;
        }
        Weapon weapon = (Weapon) object;
        if (name == weapon.name){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Weapon name - " + name + "\nIs working : " + isOk;
    }
    public void brake(){
        isOk = false;
    }
    @Override
    public Weapon copy(){
        Weapon weapon = new Weapon(name);
        weapon.isOk = this.isOk;
        return weapon;
    }
}
