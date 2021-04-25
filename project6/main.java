package project6;

public class main {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Rectangle r1=new Rectangle();
        Triangle t1=new Triangle();
        c1.floorSpace1(4);
        c1.form1("圆形",10);
        c1.calculate(c1.getFloorSpace());
        r1.floorSpace1(4,3);
        r1.form1("矩形",10);
        r1.calculate(r1.getFloorSpace());
        t1.floorSpace1(6);
        t1.form1("三角形",10);
        t1.calculate(t1.getFloorSpace());
    }
}
