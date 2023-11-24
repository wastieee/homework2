package Task1;


import java.util.Arrays;

public class task1_3 {
    public static void main(String[] args) {
        String[] values = {"9", "2", "-2", "-10", "5"};
        String target = "0";

        boolean found = Arrays.asList(values).contains(target);

        System.out.println(found);
    }
}
