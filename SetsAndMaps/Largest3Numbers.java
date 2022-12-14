package SetsAndMaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder()) // обърни ги в обратен ред
                .limit(3) // вземи само 3
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
