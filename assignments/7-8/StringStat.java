import java.util.Scanner;

public class StringStat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = reader.nextLine();

        String[] words = input.split(" ");

        int wordCount = words.length;
        int totalWordLength = 0;

        for (String word : words) {
            totalWordLength += word.length();
        }

        int sentenceLength = input.length();

        double averageWordLength = (double) totalWordLength / wordCount;

        System.out.println("Number of words: " + wordCount);
        System.out.println("Average word length: " + averageWordLength);
        System.out.println("Length of the sentence: " + sentenceLength);

    }
}