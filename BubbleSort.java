import java.util.Random;

public class BubbleSort {
    private int[] bubbleArray;
    private int nItems;

    public BubbleSort(int max) {
        bubbleArray = new int[max];
        nItems=0;
    }

    public void insert(int value) {
        bubbleArray[nItems] = value;
        nItems++;
    }

    public void sort(){
        int out,in;
        for (out=nItems-1; out>1; out--) {
            for (in=0; in<out; in++) {
                if (bubbleArray[in]>bubbleArray[in+1]) {
                    exchange(in, in+1);
                }
            }
        }
    }

    private void exchange(int a, int b) {
        int temp = bubbleArray[a];
        bubbleArray[a] = bubbleArray[b];
        bubbleArray[b] = temp;
    }


    public void play() {
        System.out.print("");
        for(int j=0; j<nItems; j++) {
            System.out.print(bubbleArray[j] + " ");
        }
        System.out.println("");
    }


}
