package battle2023.ucp;

public class Tank 
extends MilitaryAsset {
    public Tank() {
        super();
    }

    private Soldier pilot= null;

///////////////// INICIO ENCAPSULACION /////////////////

    private Soldier getSoldier(){
        return pilot;
    }

    private void setSoldier(Soldier value){
        pilot= value;
    }

    public void setPilot(Soldier value) {
        pilot= value;
    }

    public Soldier getPilot(){
        return pilot;
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
