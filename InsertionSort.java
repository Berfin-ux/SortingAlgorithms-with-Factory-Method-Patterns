import java.util.Random;

public class InsertionSort {
    private int[] insertionArray;
    private int nItems;

    public InsertionSort(int max) {
        insertionArray = new int[max];
        nItems=0;
    }

    public void insert(int value) {
        insertionArray[nItems] = value;
        nItems++;
    }

    public void sort() {
        int out,in;
        for (out=1; out<nItems; out++) {
            int temp = insertionArray[out];
            in=out;
            while (in>0 && insertionArray[in-1] >= temp) {
                insertionArray[in] = insertionArray[in-1];
                --in;
            }
        insertionArray[in] = temp;
        }
    }


    public void play() {
        System.out.print("");
        for(int j=0; j<nItems; j++) {
            System.out.print(insertionArray[j] + " ");
        }
        System.out.println("");
    }

}
