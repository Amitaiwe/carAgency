package com.example.car_agency;

import java.util.ArrayList;

public class agency {
    String name;
    ArrayList<branch> b = new ArrayList<branch>();


    public agency() {
        //branch 1
        Jeep c1 = new Jeep("toyota", 2019, 120000, true, true);
        Jeep c2 = new Jeep("Isuzu", 2017, 80000, true, true);
        FamilyPrivate c3 = new FamilyPrivate("kia", 2020, 72000, false, 1200, "samsung" );
        FamilyPrivate c4 = new FamilyPrivate("Mitsubishi", 2022, 92000, true, 1500, "samsung" );
        Luxury c5 = new Luxury("Porshe", 2021, 320000, true, 2200, true);
        Luxury c6 = new Luxury("BMW", 2021, 360000, true, 2200, true);
        Motor c7 = new Motor("Honda", 2016, 14000, false);
        Motor c8 = new Motor("Honda", 2022, 54000, true);

        ArrayList<car> branch1 = new ArrayList<>();
        branch1.add(c1);
        branch1.add(c2);
        branch1.add(c3);
        branch1.add(c4);
        branch1.add(c5);
        branch1.add(c6);
        branch1.add(c7);
        branch1.add(c8);

        branch Taibe = new branch("Taibe", branch1);

        // branch no 2
        Jeep c9 = new Jeep("toyota", 2021, 170000, true, true);
        Jeep c10 = new Jeep("Jeep", 2022, 180000, true, true);
        FamilyPrivate c11 = new FamilyPrivate("Ford", 2020, 85000, true, 1200, "JVC" );
        FamilyPrivate c12 = new FamilyPrivate("Mazda", 2020, 98000, false, 1500, "samsung" );
        Luxury c13 = new Luxury("Porshe", 2017, 220000, true, 2200, false);
        Luxury c14 = new Luxury("Mercedes", 2022, 560000, true, 4200, true);
        Motor c15 = new Motor("Honda", 2012, 4000, false);
        Motor c16 = new Motor("KTM", 2016, 51000, true);

        ArrayList<car> branch2 = new ArrayList<>();
        branch2.add(c9);
        branch2.add(c10);
        branch2.add(c11);
        branch2.add(c12);
        branch2.add(c13);
        branch2.add(c14);
        branch2.add(c15);
        branch2.add(c16);

        branch jeru = new branch("Jerusalem", branch2);
        // branch 3
        Jeep c17 = new Jeep("Hammer", 2011, 40000, true, true);
        Jeep c18 = new Jeep("Isuzu", 2020, 180000, true, false);
        FamilyPrivate c19 = new FamilyPrivate("Mazda", 2022, 112000, true, 1200, "samsung" );
        FamilyPrivate c20 = new FamilyPrivate("Opel", 2020, 62000, true, 1500, "JVC" );
        Luxury c21 = new Luxury("Audi", 2021, 375000, true, 3000, true);
        Luxury c22 = new Luxury("Lexus", 2022, 460000, true, 2600, true);
        Motor c23 = new Motor("KTM", 2017, 50000, false);
        Motor c24 = new Motor("Yamaha", 2020, 70000, true);

        ArrayList<car> branch3 = new ArrayList<>();
        branch3.add(c17);
        branch3.add(c18);
        branch3.add(c19);
        branch3.add(c20);
        branch3.add(c21);
        branch3.add(c22);
        branch3.add(c23);
        branch3.add(c24);

        branch Haifa = new branch("Haifa", branch3);

        ArrayList<branch> agency = new ArrayList<>();

        agency.add(Haifa);
        agency.add(jeru);
        agency.add(Taibe);

        this.b=agency;
        this.name = "agencyName";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<branch> getB() {
        return b;
    }

    public void setB(ArrayList<branch> b) {
        this.b = b;
    }
    public void addCar(String b, String c, int y, int p, boolean o){//motor
        Motor m = new Motor(c, y, p ,o);
        System.out.println("motor added");
        for (branch br : this.getB()){
            if(br.getCity()==b){
                br.getCars().add(m);
            }
        }
    }
    public void addCar(String b, String c, int y, int p, int e,boolean mobileye,String multy){//family
        FamilyPrivate f = new FamilyPrivate(c, y, p, mobileye, e, multy);
        System.out.println("family car added");
        for (branch br : this.getB()){
            if(br.getCity()==b){
                br.getCars().add(f);
            }
        }
    }
    public void addCar(String b, String c, int y, int p, int engine, boolean mobileye, boolean massage){//luxury
        Luxury l = new Luxury(c, y, p, mobileye, engine, massage);
        System.out.println("luxury car added");
        for (branch br : this.getB()){
            if(br.getCity()==b){
                br.getCars().add(l);
            }
        }
    }
    public void addCar(String b, String c, int y, int p, boolean Awd, boolean ws){//jeep
        Jeep j = new Jeep(c, y, p, Awd, ws);
        System.out.println("jeep added");
        for (branch br : this.getB()){
            if(br.getCity()==b){
                System.out.println("jeep added like a boos");
                br.getCars().add(j);
            }
        }
    }

}
