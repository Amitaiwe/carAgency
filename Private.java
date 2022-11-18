package com.example.car_agency;

public abstract class Private extends car{
    boolean Mobileye;
    int EngineCapacity;

    public Private(String company, int year, int price, boolean mobileye, int engineCapacity) {
        super(company, year, price);
        Mobileye = mobileye;
        EngineCapacity = engineCapacity;
    }

    public boolean isMobileye() {
        return Mobileye;
    }

    public void setMobileye(boolean mobileye) {
        Mobileye = mobileye;
    }

    public int getEngineCapacity() {
        return EngineCapacity;
    }


    public void setEngineCapacity(int engineCapacity) {
        EngineCapacity = engineCapacity;
    }

}
