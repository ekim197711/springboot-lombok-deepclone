package com.example.demo.space;

import lombok.Builder;
import lombok.ToString;
import lombok.With;

@ToString
@With
@Builder(toBuilder = true)
public class SpaceShip implements Cloneable{
    private String model;
    private Integer fuel;
    private Captain captain;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SpaceShip clone = (SpaceShip) super.clone();
        clone.setCaptain((Captain)clone.getCaptain().clone());
        return clone;
    }

    public SpaceShip(String model, Integer fuel, Captain captain) {
        this.model = model;
        this.fuel = fuel;
        this.captain = captain;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getFuel() {
        return fuel;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public Captain getCaptain() {
        return captain;
    }

    public void setCaptain(Captain captain) {
        this.captain = captain;
    }
}
