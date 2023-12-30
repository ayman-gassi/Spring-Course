package coreservlete;

public class Cercle implements Shape {
    Float Radius;
    @Override
    public Float Calcul() {
        return Radius * Radius ;
    }

    public Float getRadius() {
        return Radius;
    }

    public void setRadius(Float radius) {
        Radius = radius;
    }
}
