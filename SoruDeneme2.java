import java.util.Scanner;

public class SoruDeneme2 {
    public static void main(String[] args) {

        SortFactory factory = new SortFactory();

        factory.createSort("Bubble sort");
        factory.createSort("Insertion sort");
        factory.createSort("Quick sort");

        System.out.print("Hangi sıralama algoritmasını tercih edersiniz?: ");
        Scanner scanner = new Scanner(System.in);
        String sort = scanner.nextLine();
        if (sort.equalsIgnoreCase("Bubble sort")) {
            factory.createSort("Bubble sort");
        }
        else if (sort.equalsIgnoreCase("Insertion sort")) {
            factory.createSort("Insertion sort");
        }
        else if (sort.equalsIgnoreCase("Quick Sort")) {
            factory.createSort("Quick sort");
        }


    }
}
