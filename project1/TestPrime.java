package project1;

import static java.lang.Math.sqrt;

public class TestPrime {
    int[][] array = new int[10][10];
    int num=0;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private int number;
    public TestPrime() {
    }

    public TestPrime(int[][] array, int num) {
        this.array = array;
        this.num = num;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }
//成员方法init: 将二维数组的初始化为1-100，如1-10在第一行，11-20在第二行等
    public void init() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = 10 * i + j + 1;

            }
        }

    }
//成员方法display：按行输出该二维数组
    public void display() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (array[i][j] % 10 != 0) {
                    System.out.print(array[i][j]);
                } else {
                    System.out.print(array[i][j] + "\n");
                }
            }
        }

    }
    //成员方法getPrimeTotalNumber：得到二维数组中质数的个数
    public void getPrimeTotalNumber(){
        boolean t=false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(array[i][j]==2||array[i][j]==3){
                    num=num+1;
                }else if(array[i][j]==1){
                    num=num;
                }
                else {
                    for (int k = 2; k <= sqrt(array[i][j]); k++) {
                            if(array[i][j]%k==0){
                                t=false;
                                break;
                            }else {
                                t=true;
                            }
                    }
                    if(t){
                        num=num+1;
                    }
                }
            }
        }
        System.out.println(num);
    }
    //成员方法getPrimeAndPosition：按行输出每个质数及其位置，格式为质数（行号，列号），如质数13（2，3）
    public void getPrimeAndPosition(){
        boolean t=false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(array[i][j]==2||array[i][j]==3){
                    num=num+1;
                    System.out.println("质数"+array[i][j]+"("+(i+1)+","+(j+1)+")");
                }else if(array[i][j]==1){
                    num=num;
                }
                else {
                    for (int k = 2; k <= sqrt(array[i][j]); k++) {
                        if(array[i][j]%k==0){
                            t=false;
                            break;
                        }else {
                            t=true;
                        }
                    }
                    if(t){
                        num=num+1;
                        System.out.println("质数"+array[i][j]+"("+(i+1)+","+(j+1)+")");
                    }
                }
            }
        }

    }
    private boolean testnumber(int number){
        boolean t=false;
        if(number==1){
            t=false;
            System.out.println("不是质数");
            return false;
        }else if(number==2||number==3){
            t=true;
            System.out.println("是质数");
            return true;
        }else{
            for (int i = 2; i <=sqrt(number); i++) {
                if(number%i==0){
                    t=false;

                }else {
                    t=true;
                }
            }
            if(t){
                System.out.println("是质数");
                return true;
            }else {
                System.out.println("不是质数");
                return false;
            }
        }
    }

    public void test1(){
      testnumber(getNumber());
    }
}
