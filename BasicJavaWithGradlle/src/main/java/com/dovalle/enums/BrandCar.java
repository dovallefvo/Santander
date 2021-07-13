package com.dovalle.enums;

public enum BrandCar {
    VOLKSWAGEM (1, "Volkswagem"),
    FIAT(2, "Fiat"),
    CHEVROLET (3, "Chevrolet");

    private Integer codeBrand;
    private String nameBrand;

    BrandCar(final Integer codeBrand, final String name){
        this.codeBrand = codeBrand;
        this.nameBrand = name;
    }

    public Integer getCodeBrand() {
        return codeBrand;
    }

    public String getNameBrand() {
        return nameBrand;
    }
}
