package project3;

public class Point {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;

    public Point() {
        setX(0);
        setY(0);
        //System.out.println("初始化为：("+getX()+","+getY()+")");
    }

    public void getPoint(){
        System.out.println("坐标为：("+getX()+","+getY()+")");
    }
    //movePoint(int,int)带两个int参数，用来修改x，y构成的坐标点
    public void movePoint(int x1,int y1){
        setY(x1);
        setY(y1);
        //System.out.println("变化后的坐标为("+getX()+","+getY()+")");
    }
}
