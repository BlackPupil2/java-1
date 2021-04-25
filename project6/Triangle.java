package project6;

import static java.lang.StrictMath.sin;
import static java.lang.StrictMath.sqrt;

public class Triangle extends Cube{
    public Triangle() {
    }

    public Triangle(double height, double floorSpace) {
        super(height, floorSpace);
    }
    double lengthT;
    public double floorSpace1(double lengthT){
        this.lengthT=lengthT;
        this.floorSpace=(sqrt(3)/4)* lengthT * lengthT ;
        return this.floorSpace;
    }

    @Override
    public void form1(String form, int height) {
        super.form1(form, height);
    }

    @Override
    public void calculate(double floorSpace) {
        super.calculate(floorSpace);
    }
}
