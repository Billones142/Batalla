package battle2023.ucp;

public class Soldier 
extends MilitaryAsset
{
    public Soldier()
    {
        super();
    }
    
    @Override
    public void damage(int amount)
    {
        amount= amount/2;
        super.damage((int)amount);
    }
}