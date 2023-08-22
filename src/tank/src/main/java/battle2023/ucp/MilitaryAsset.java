package battle2023.ucp;

public abstract class MilitaryAsset {
        
    private int health;
    private String name;

    public MilitaryAsset() {
        super();
        setName("x");
        setHealth(5);
    }

///////////////// INICIO ENCAPSULACION /////////////////

    protected int getHealth()
    {
        return health;
    }

    protected void setHealth(int value)
    {
        health= value;
    }

    protected String getName()
    {
        return name;
    }

    protected void setName(String value)
    {
        name= value;
    }

///////////////// FIN ENCAPSULACION /////////////////

    public boolean isAlive()
    {
        return getHealth() > 0;
    }

    public void damage(int amount)
    {
        setHealth(getHealth() - amount);
        return;
    }

    public void heal(int amount)
    {
        setHealth(getHealth() + amount);
        return;
    }

    public void attack(MilitaryAsset target)
    {
        target.damage(1);
    }
}
