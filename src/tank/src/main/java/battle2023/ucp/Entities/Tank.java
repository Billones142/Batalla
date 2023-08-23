package battle2023.ucp.Entities;

public class Tank 
extends MilitaryAsset
{

    public Tank()
    {
        super();
    }

    private Soldier pilot= null;


    ///////////////// INICIO ENCAPSULACION /////////////////

    public Soldier getPilot(){
        return pilot;
    }

    public void setPilot(Soldier value){
        pilot= value;
    }

    ///////////////// FIN ENCAPSULACION /////////////////

    public void repair()
    {
        if (getHealth() == 0){
            setHealth(5.0);
        }
        return;
    }

    public void reinforce(Double amount)
    {
        if(getHealth() > 0){
            setHealth(getHealth()+amount);
        }
    }


    public boolean hasPilot() 
    {
        return pilot != null;
    }

    @Override
    public void damage(Double amount, Double percentage)
    {
        setHealth(getHealth() - (amount*(percentage/100)/2));
    }

    @Override
    public void damage(Double amount)
    {
        damage(amount,100.00);
    }
    

    @Override
    public void attack(MilitaryAsset target)
    {
        target.damage(3.0);
    }
}