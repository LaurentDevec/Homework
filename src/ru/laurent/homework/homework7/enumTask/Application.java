package ru.laurent.homework.homework7.enumTask;

import java.util.Arrays;

public class Application  {
    public static void main(String[] args) {
        Planet[] planets = Planet.values();
        System.out.println("In Sun system are 3 planets: " + Arrays.toString(planets));
        for (Planet planet: planets) {

            System.out.println("Name of planet: " + planet.getName());
            System.out.println("Radius of planet in thousand km: " + planet.getRadius());
            System.out.println("Mass of planet in million kg: " +planet.getMass());

        }
    }
}
