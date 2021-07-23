public class SortFactory {
    public Sort createSort(String sort) {
        if ("Bubble Sort".equalsIgnoreCase(sort)) {
            return new Sort1();
        }
        else if ("Insertion Sort".equalsIgnoreCase(sort)) {
            return new Sort2();
        }
        else if ("Quick Sort".equalsIgnoreCase(sort)) {
            return new Sort3();
        }

        else {
            return null;
        }
    }
}
