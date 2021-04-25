package project6;

public class Rectangle extends Cube {
    public Rectangle() {
    }

    public Rectangle(double height, double floorSpace) {
        super(height, floorSpace);
    }
    double length;
    double width;
    public double floorSpace1(double length,double width){
        this.length=length;
        this.width=width;
        this.floorSpace=length*width;
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
