package project6;

public class Circle extends Cube {
    public Circle(double height, double floorSpace) {
        super(height, floorSpace);
    }
    double r;
    double pi=3.14;
    public Circle() {
    }
    public double floorSpace1(double r){
        this.floorSpace=pi*r*r;
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
