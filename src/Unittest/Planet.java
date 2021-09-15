package Unittest;

import java.util.ArrayList;

public class Planet extends OrbitalObject {




    public Planet(String name, String color, double circumference, String location, long distanceFromSun) {
        super(name, color, circumference, location, distanceFromSun, PlanetOrMoon.PLANET);
    }


    public static ArrayList<Planet> make(Planet... planets) {
        ArrayList result = new ArrayList<>(planets.length);
        for (int i = 0; i < planets.length; i++) {
            result.add(planets[i]);
        }
        return result;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
