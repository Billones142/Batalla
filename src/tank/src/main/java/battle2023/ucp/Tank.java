package battle2023.ucp;

public class Tank 
extends MilitaryAsset
{

    public Tank()
    {
        super();
    }

    private Soldier pilot= null;


    public void repair()
    {
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

    public boolean hasPilot() 
    {
        return pilot != null;
    }
}
