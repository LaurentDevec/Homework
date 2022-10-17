package ru.laurent.homework.homework7.enumTask;

public class SunSystem {

    private String name;
    private int mass;
    private int radius;
    private Planet planet;

    public SunSystem(String name, int mass, int radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    }
