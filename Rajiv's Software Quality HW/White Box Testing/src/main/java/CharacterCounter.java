import java.util.Scanner;

public class CharacterCounter {

    public static int occurencesCounted(char[] charArray, char target) {
        int occurrences = 0;
        for (char c : charArray) {
            if (c == target) {
                occurrences++;
            }
        }
        return occurrences;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input array from the user
        System.out.print("Please enter the number of characters in the array: ");
        int size = scanner.nextInt();
        char[] characterArray = new char[size];
        
        System.out.println("Please enter all characters in the array (please enter them with spaces): ");
        for (int i = 0; i < size; i++) {
            characterArray[i] = scanner.next().charAt(0);
        }

        // Input target character from the user
        System.out.print("Please enter the target character: ");
        char target = scanner.next().charAt(0);

        int occurrences = occurencesCounted(characterArray, target);
        System.out.println("The total number of occurrences of '" + target + "' is: " + occurrences);
    }
}
