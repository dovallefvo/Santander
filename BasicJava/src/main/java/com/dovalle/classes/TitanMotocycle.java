package com.dovalle.classes;

import com.dovalle.interfaces.Vehicle;

public class TitanMotocycle implements Vehicle {
    private final String BRAND = "Honda";
    private final String MODEL = "Titan 150 CG";
    private final Integer QTD_WHEELS = 2;

    @Override
    public Integer qtdWheels() {
        return this.QTD_WHEELS;
    }

    @Override
    public String getModel() {
        return this.MODEL;
    }

    @Override
    public String brand() {
        return this.BRAND;
    }

    @Override
    public String toString() {
        return this.showDetails();
    }
}
