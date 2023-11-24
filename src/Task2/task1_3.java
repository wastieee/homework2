package Task2;

public class task1_3 {
    public static void main(String[] args) {

        int[] array = {9, 2, -2, -10, 5};

        int minElementIndex = 0;
        int minElement = array[minElementIndex];

        for (int i = 0; i < array.length ; i++) {
            int currentElement = array[i];

            if (currentElement < minElement) {
                minElement = currentElement;
                minElementIndex = i;
            }

        }
        System.out.println("Min element index " + minElementIndex);

    }
}

