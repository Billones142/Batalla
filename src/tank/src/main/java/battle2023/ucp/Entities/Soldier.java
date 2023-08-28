package battle2023.ucp.Entities;

public class Soldier 
extends MilitaryAsset
{ 
    public Soldier(String name, Double health)
    {
        super();
        setHealth(health);
        setName(name);
    }
}