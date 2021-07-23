import java.util.Random;

public class Sort2 implements Sort {
    public Sort2() {
        display();
    }

    public void random(InsertionSort sort) {
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            int r = random.nextInt(100);
            sort.insert(r);
        }
    }

    @Override
    public void display() {
        InsertionSort insertionSort = new InsertionSort(100);
        random(insertionSort);
        long before = System.currentTimeMillis();
        System.out.println("Unsorted: ");
        insertionSort.play();
        System.out.println("Sorted: ");
        insertionSort.sort();
        insertionSort.play();
        long after = System.currentTimeMillis();
        long fark = after-before;
        System.out.print("Process completion time: ");
        System.out.println(fark + " msec");
    }
}
