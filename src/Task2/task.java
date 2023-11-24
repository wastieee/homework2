package Task2;

public class task {
    public static void main(String[] args) {

        int[] array = {4};

        int minElementIndex = 0;
        int minElement = array[minElementIndex];

        for (int i = 0; i < array.length ; i++) {
            int currentElement = array[i];

            if (currentElement < minElement) {
                minElement = currentElement;
                minElementIndex = i;
                System.out.println("Min element index " + minElementIndex);
            }

        }
        System.out.println("Min element index " + minElementIndex);

    }
}
