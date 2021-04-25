package project2;

public class ArraySort {

    int[] sim=new int[100];

    public ArraySort(int[] sim) {
        this.sim = sim;
    }

    public void setOrder(){
        int t=0;
        for (int i = 0; i < sim.length-1; i++) {
            for (int j = i+1; j < sim.length; j++) {
                if(sim[i]>sim[j]){
                    t=sim[i];
                    sim[i]=sim[j];
                    sim[j]=t;
                }

            }
        }
    }

}
