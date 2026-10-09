//Write a program that does a linear search with words in a sentence. User inputs a sentence. Say what word it is looking for. Return pos of word or say if it is not there. Need main and class
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Sentence: ");
        String sentence = reader.nextLine();

        System.out.print("What word are you looking for: ");
        String word = reader.nextLine();

        Class WordSearch = new Class(sentence, word);
        System.out.println(WordSearch.look());
    }
}
