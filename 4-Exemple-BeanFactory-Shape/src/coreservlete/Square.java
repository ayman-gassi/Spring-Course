package coreservlete;

public class Square implements Shape {
    Float Side;
    @Override
    public Float Calcul() {
        return Side * 2 ;
    }

    public Float getSide() {
        return Side;
    }

    public void setSide(Float side) {
        Side = side;
    }
}
