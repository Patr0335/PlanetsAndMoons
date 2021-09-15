package Unittest;

public class SolarSystem {

    public static void main(String[] args) {

        var planets = Planet.make(new Planet("Earth","Blue",40030.2,"3rd from the sun",93648944),
        new Planet("Mars","Red",21296,"4th from the sun",246806302),
        new Planet("Jupiter","Grey",439263,"5th from the sun",750947730));

        for (var element : planets) {
            System.out.println(element.getProfile());
        }


    }
}
