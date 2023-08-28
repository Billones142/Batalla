package battle2023.ucp.Entities;

import java.util.Random;

public class ShieldRandomPercentage extends ShieldBase{

    public ShieldRandomPercentage(String name, Double shield) {
        super();
        setName(name);
        setShield((Double) (Math.random() * 100.0));
    }

    
}
