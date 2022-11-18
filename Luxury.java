package com.example.car_agency;

public class Luxury extends Private{
    boolean massageChairs;

    public Luxury(String company, int year, int price, boolean mobileye, int engineCapacity, boolean massageChairs) {
        super(company, year, price, mobileye, engineCapacity);
        this.massageChairs = massageChairs;
    }

    public boolean isMassageChairs() {
        return massageChairs;
    }

    public void setMassageChairs(boolean massageChairs) {
        this.massageChairs = massageChairs;
    }

    @Override
    public String toString() {

        if(!Mobileye && !massageChairs){
            return company +" "+ year +" "+ EngineCapacity +  "cc price: "+price;
        }
        if(Mobileye && !massageChairs){
            return company +" "+ year +" "+ EngineCapacity +  "cc price: "+price + " Have mobileye";
        }
        if(!Mobileye && massageChairs){
            return company +" "+ year +" "+ EngineCapacity +  "cc price: "+price + " Have Massage chairs";
        }
        if(Mobileye && massageChairs){
            return company +" "+ year +" "+ EngineCapacity +  "cc price: "+price + " Have mobileye and Massage chairs!!";
        }
        return null;
    }

    @Override
    public String getClassName() {
        return "private";
    }
}
