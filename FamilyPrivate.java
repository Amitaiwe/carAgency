package com.example.car_agency;

public class FamilyPrivate extends Private{
    String multyMediaSystemCompany;

    public FamilyPrivate(String company, int year, int price, boolean mobileye, int engineCapacity, String multyMediaSystemCompany) {
        super(company, year, price, mobileye, engineCapacity);
        this.multyMediaSystemCompany = multyMediaSystemCompany;
    }

    public String getMultyMediaSystemCompany() {
        return multyMediaSystemCompany;
    }

    public void setMultymediaSystemCompany(String multyMediaSystemCompany) {
        this.multyMediaSystemCompany = multyMediaSystemCompany;
    }

    @Override
    public String toString() {


        if(!Mobileye){
            return company +" "+ year +" "+ EngineCapacity +  "cc price: "+price +" "+multyMediaSystemCompany+" multymedia";
        }
        if(Mobileye){
            return company +" "+ year +" "+ EngineCapacity +  "cc price: "+price + " Have mobileye"+" "+multyMediaSystemCompany+" multymedia";
        }

        return null;

    }

    @Override
    public String getClassName() {
        return "private";
    }

}
