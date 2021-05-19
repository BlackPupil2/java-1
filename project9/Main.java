package project9;

interface learn {
    void print1();
}

interface work {
void print2();
}

public class Main {
    public static void main(String[] args) {
    WorkStudent w1=new WorkStudent();
    w1.print1();
    w1.print2();
    }
}
class WorkStudent implements learn,work{


    @Override
    public void print1() {
        System.out.println("在学习");
    }

    @Override
    public void print2() {
        System.out.println("在工作");
    }
}