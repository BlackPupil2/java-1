package project2;

public class Demo01 {
    public static void main(String[] args) {
        int[] a1={1,22,13,4,52,6,7,8,9,10};
        ArraySort s1=new ArraySort(a1);
        s1.setOrder();
        for (int i = 0; i < s1.sim.length; i++) {
            System.out.println(s1.sim[i]);
        }

    }
}
