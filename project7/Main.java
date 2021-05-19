package project7;

interface Print {

    void print();
}


public class Main {
    public static void main (String[] args) {
        PrintTT t1 = new PrintTT();
        PrintSS t2 = new PrintSS();
        t1.print();
        t2.print();
    }
}

class PrintTT implements Print {
    @Override
    public void print () {
        System.out.println("打印HP!");
    }
}



class PrintSS implements Print{
    @Override
    public void print() {
        System.out.println("打印Epson");
    }
}