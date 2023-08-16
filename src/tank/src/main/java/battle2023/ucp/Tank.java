package battle2023.ucp;

public class Tank {

    private int health = 5;
    private String name= "";
    private Soldier pilot= null;

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

    private Soldier getSoldier(){
        return pilot;
    }

    private void setSoldier(Soldier value){
        pilot= value;
    }

    public void setPilot() {
        pilot= new Soldier();
    }

///////////////// FIN ENCAPSULACION /////////////////



    public boolean isAlive() {
        return getHealth() > 0;
    }

    public void damage(int amount) {
        setHealth(getHealth() - amount);
        return;
    }

    public void repair() {
        if (getHealth() == 0){
            setHealth(5);
        }
        return;
    }

    public void reinforce(int amount) 
    {
        if(getHealth() > 0){
            setHealth(getHealth()+amount);
        }
    }

    public boolean hasPilot() {
        return pilot != null;
    }
}
