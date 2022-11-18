package com.example.car_agency;

public class Jeep extends car{

    boolean AWD;
    boolean windShield;

    public Jeep(String company, int year, int price, boolean AWD, boolean windShield) {
        super(company, year, price);
        this.AWD = AWD;
        this.windShield = windShield;
    }

    public boolean isAWD() {
        return AWD;
    }

    public void setAWD(boolean AWD) {
        this.AWD = AWD;
    }


    public boolean isWindShield() {
        return windShield;
    }

    public void setWindShield(boolean windShield) {
        this.windShield = windShield;
    }



    @Override
    public String toString() {

        if(AWD && windShield){
            return company +" "+ year +" "+ "price: "+price + " 4x4 with wind shield";
        }
        if(!AWD && windShield){
            return company +" "+ year +" "+ "price: "+price + " with wind shield";
        }
        if(AWD && !windShield){
            return company +" "+ year +" "+ "price: "+price + " 4x4";
        }
        if(!AWD && !windShield){
            return company +" "+ year +" "+ "price: "+price;
        }
        return null;
    }

    @Override
    public String getClassName() {
        return "jeep";
    }
}
