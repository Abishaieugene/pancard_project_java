package pancard;
import java.util.Random;
import java.util.Scanner;

public class PanIdGeneration {
    
    private static String generateRandomCharacters(int length, String characters) {
        Random random = new Random();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String randomLetters = generateRandomCharacters(5, letters);
        String randomDigits = generateRandomCharacters(4, digits);
        String finalLetter = generateRandomCharacters(1, letters);
        String generatedId = randomLetters + randomDigits + finalLetter;
        System.out.println("Generated ID: " + generatedId);

        scanner.close();
    }
}

