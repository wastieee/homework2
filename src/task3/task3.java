package task3;

public class task3 {
    public static void main(String[] args) {
        int array[][] = {
                {4}

        };
        int minElemIndexI = 0;
        int minElemIndexJ = 0;
        int minElem = array[minElemIndexI][minElemIndexJ];

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array.length ; j++) {

                int currentElem = array[i][j];

                if (currentElem <= minElem) {
                    minElem = currentElem;
                    minElemIndexI = i;
                    minElemIndexJ = j;

                }


            }

        }
        System.out.println("Min indexes i = " + minElemIndexI);
        System.out.println("Min indexes j = " + minElemIndexJ);
    }
}



