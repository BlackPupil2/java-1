package project6;

public class Cube {
    double height;
    double floorSpace;
    String form;
    double v1;

    public Cube() {
    }

    public Cube(double height, double floorSpace) {
        this.height = height;
        this.floorSpace = floorSpace;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFloorSpace() {
        return floorSpace;
    }

    public void setFloorSpace(double floorSpace) {
        this.floorSpace = floorSpace;
    }

    public void form1(String form,int height){
        setHeight(height);
        System.out.println("类别:"+form+" "+"高："+getHeight()+" "+"底面积:"+String.format("%.2f", this.floorSpace));
    }
    public void calculate( double floorSpace){
           v1=floorSpace*this.height;

        System.out.println("体积是："+String.format("%.2f", v1));

    }
}
