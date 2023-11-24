package Task1;


import java.util.Arrays;

public class task1_2 {
    public static void main(String[] args) {
        String[] values = {"4", "10", "9", "2", "5"};
        String target = "9";

        boolean found = Arrays.asList(values).contains(target);

        System.out.println(found);
    }
}
