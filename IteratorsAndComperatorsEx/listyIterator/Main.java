package IteratorsAndComperatorsEx.listyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ListyIterator listyIterator = null;
        while (!input.equals("END")) {
            String[] commandParts = input.split(" ");
            String commandName = commandParts[0];
            switch (commandName) {
                case "Create":
                    // копираме от 1ви елемент до края
                    if (commandParts.length > 1) {
                        listyIterator = new ListyIterator(Arrays.copyOfRange(commandParts, 1, commandParts.length));
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    for (String element : listyIterator) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
