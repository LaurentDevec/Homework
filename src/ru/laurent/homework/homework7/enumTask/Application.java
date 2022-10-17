package ru.laurent.homework.homework7.enumTask;

import java.util.Arrays;

public class Application  {
    public static void main(String[] args) {

        SunSystem planet01 = new SunSystem("MARS", 404, 678);
        SunSystem planet02 = new SunSystem("JUPITER", 111, 456);
        SunSystem planet03 = new SunSystem("SATURN", 567, 789);
        planet01.setPlanet(Planet.MARS);
        System.out.println(planet01.getPlanet());

        Planet[] planets = Planet.values();
        System.out.println(Arrays.toString(planets));

        System.out.println(planet01.getName());
        System.out.println(planet02.getRadius());
        System.out.println(planet03.getMass());


        /*for (int i = 1; i < 4; i++) {
                for (Planet planet : planets) {
                System.out.println("planet " + i + planet.name());
            }
            }*/
    }
}
