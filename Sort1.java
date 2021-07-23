import java.util.Random;

public class Sort1 implements Sort {
    public Sort1() {
        display();
    }

    public void random(BubbleSort sort) {
        Random random = new Random();
        for (int j = 0; j < 100; j++) {
            int r = random.nextInt(100);
            sort.insert(r);
        }
    }

    @Override
    public void display() {
        BubbleSort bubbleSort = new BubbleSort(100);
        random(bubbleSort);
        long before = System.currentTimeMillis();
        System.out.println("Unsorted: ");
        bubbleSort.play();
        System.out.println("Sorted: ");
        bubbleSort.sort();
        long after = System.currentTimeMillis();
        bubbleSort.play();
        long fark = after-before;
        System.out.print("Process completion time: ");
        System.out.println(fark + " msec");
    }
}
