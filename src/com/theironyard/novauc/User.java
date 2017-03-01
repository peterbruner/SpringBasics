package com.theironyard.novauc;


import java.util.ArrayList;

public class User {

    private String nombre;
    private String thingys;
    ArrayList<String> aVector = new ArrayList<>();

    public User(String nombre) {
        this.nombre = nombre;
        //System.out.println("user constructor was accessed\n thus setting the object nombre to the variable in question");
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("so whats the point of a setter anyway?");
    }
}
