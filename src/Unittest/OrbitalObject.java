package Unittest;

public abstract class OrbitalObject {
    private String name;
    private String color;
    private double circumference;
    private String location;
    private long distanceFromSun;
    private PlanetOrMoon typeOfplanetOrMoon;


    public OrbitalObject(String name, String color, double circumference, String location, long distanceFromSun, PlanetOrMoon planetormoon) {
        this.name = name;
        this.color = color;
        this.circumference = circumference;
        this.location = location;
        this.distanceFromSun = distanceFromSun;
        this.typeOfplanetOrMoon = planetormoon;
    }

    public OrbitalObject(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        distanceFromSun = distanceFromSun;
    }


    @Override
    public String toString() {
        return "OrbitalObject{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + circumference +
                ", placering='" + location + '\'' +
                ", DistanceFromSun=" + distanceFromSun +
                ", typeOfPlanetOrMoon='" + typeOfplanetOrMoon.toString() + '\'' +
                '}';
    }

    public String getProfile() {
        return "name: " + getName() + " color: " + getColor() + " circumference: "  + getCircumference() + "km" + " location: " + getLocation() + " Distance From Sun: " + getDistanceFromSun() + "km";
    }
}
