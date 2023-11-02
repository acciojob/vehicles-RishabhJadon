package com.driver;

public class Boat implements WaterVehicle{

    private String name;

    private int capicity;

    public Boat(String name, int capicity) {
        this.name = name;
        this.capicity = capicity;
    }

    @Override
    public String getVehicleName()
    {
        return name;
    }

    @Override
    public int getVehicleCapacity()
    {
        return capicity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapicity() {
        return capicity;
    }

    public void setCapicity(int capicity) {
        this.capicity = capicity;
    }

}
