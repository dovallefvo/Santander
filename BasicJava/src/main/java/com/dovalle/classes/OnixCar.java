package com.dovalle.classes;

import com.dovalle.enums.BrandCar;
import com.dovalle.interfaces.Vehicle;

public class OnixCar implements Vehicle {
    @Override
    public String brand() {
        return BrandCar.CHEVROLET.getNameBrand();
    }

    @Override
    public String getModel() {
        return "Onix";
    }

    @Override
    public String toString() {
        return this.showDetails();
    }
}
