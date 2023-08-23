package battle2023.ucp;

public abstract class MilitaryAsset {
        
    private Double health;
    private String name;

    public MilitaryAsset() {
        super();
        setName("x");
        setHealth(5.0);
    }

///////////////// INICIO ENCAPSULACION /////////////////

    protected double getHealth()
    {
        return health;
    }

    protected void setHealth(Double value)
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

    public void damage(Double amount)
    {
        setHealth(getHealth() - amount);
        return;
    }

    public void heal(Double amount)
    {
        setHealth(getHealth() + amount);
        return;
    }

    public void attack(MilitaryAsset target)
    {
        target.damage(1.0);
    }
}
