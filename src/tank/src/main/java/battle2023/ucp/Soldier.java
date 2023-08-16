package battle2023.ucp;

public class Soldier {
    
    private int health = 5;
    private int name= null;

///////////////// INICIO ENCAPSULACION /////////////////
    private int getHealth(){
        return health;
    }

    private void setHealth(int value){
        health= value;
    }

    private String getName(){
        return name;
    }

    private void setName(String value){
        name= value;
    }
///////////////// FIN ENCAPSULACION /////////////////

    public boolean isAlive() {
        return getHealth() > 0;
    }

    public void damage(int amount) {
        setHealth(getHealth() - amount);
        return;
    }

    public void heal(int amount) {
        setHealth(getHealth() + amount);
        return;
    }
}