package com.dovalle.classes;

import com.dovalle.enums.BrandCar;
import com.dovalle.interfaces.Car;

public class OnixCar implements Car {
    @Override
    public String brand() {
        return BrandCar.CHEVROLET.getNameBrand();
    }

    @Override
    public String getModel() {
        return "Onix";
    }
}
