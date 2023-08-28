package battle2023.ucp.Entities;

import java.util.Random;

public abstract class ShieldBase{
    private Double shield;
    private String name;


    ///////////////// INICIO ENCAPSULACION /////////////////
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setShield(Double shield) {
        this.shield = shield;
    }

    public Double getShield() {
        return shield;
    }
    ///////////////// FIN ENCAPSULACION /////////////////
}
