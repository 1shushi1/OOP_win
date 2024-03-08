package interfaces.copy.prototype;

public class Potion {
    private String name;
    private String type;
    public Potion(String name, String type){
        this.name = name;
        this.type = type;
    }
    @Override
    public int hashCode(){
        int hashCode = 8;
        hashCode = 8 * hashCode + name.hashCode();
        hashCode = 8 * hashCode + type.hashCode();
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
        if (!(object instanceof Potion)){
            return false;
        }
        Potion potion = (Potion) object;
        if (name == potion.name && type == potion.type){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Potion name - " + name + " - " + "Potion type - " + type;
    }
}
