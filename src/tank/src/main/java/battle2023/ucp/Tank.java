package battle2023.ucp;

public class Tank {

    int health = 5;

    public boolean isAlive() {
        return health > 0;
    }

    public void damage(int amount) {
        health = health - amount;
        return;
    }

    public void repair() {
        if (health == 0){
            health = 5;
        }
        return;
    }

    public void reinforce(int amount) 
    {
        if(health > 0){
            health+= amount;
        }
    }

    public int report()
    {
        return health;
    }
}
