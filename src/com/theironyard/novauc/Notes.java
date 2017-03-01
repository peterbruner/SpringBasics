package com.theironyard.novauc;


import java.util.ArrayList;

public class Notes {
    private String thingys;
    ArrayList<String> aVector = new ArrayList<>();


    public Notes(String thingys) {
        this.thingys = thingys;
        //System.out.println("thingys accessed");
        aVector.add(getThingys());
        System.out.println("stuff happening wildly");

    }

    public String getThingys() {
        return thingys;
    }

}
