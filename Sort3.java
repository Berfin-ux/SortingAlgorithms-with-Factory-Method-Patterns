import java.util.Random;

public class Sort3 implements Sort {

    public Sort3() {
        display();
    }

    public void random(QuickSort sort) {
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            int r = random.nextInt(100);
            sort.insert(r);
        }
    }

    @Override
    public void display() {
        QuickSort quickSort = new QuickSort(100);
        random(quickSort);
        long before = System.currentTimeMillis();
        System.out.println("Unsorted: ");
        quickSort.play();
        System.out.println("Sorted: ");
        quickSort.sort();
        quickSort.play();
        long after = System.currentTimeMillis();
        long fark = after-before;
        System.out.print("Process completion time: ");
        System.out.println(fark + " msec");

    }
}
