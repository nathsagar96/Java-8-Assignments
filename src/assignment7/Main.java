package assignment7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //list of strings
        List<String> list = Arrays.asList("Mumbai", "Pune", "Chennai", "Udaipur", "New Delhi", "", "");

        //count of strings with length greater than 5
        long count5 = list.stream().filter(string -> string.length() > 5).count();
        System.out.println("Count of strings with length greater than 5: " + count5);

        //count of empty strings
        long count0 = list.stream().filter(string -> string.length() == 0).count();
        System.out.println("Count of empty strings: " + count0);

        //separate empty strings
        List<String> emptyStrings = list.stream().filter(string -> string.length() == 0).collect(Collectors.toList());
        System.out.println("List of Empty String" + emptyStrings);
    }
}
