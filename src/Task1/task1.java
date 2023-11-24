package Task1;


import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        String[] values = {"4"};
        String target = "1";

        boolean found = Arrays.asList(values).contains(target);

        System.out.println(found);
    }
}
