import java.util.Scanner;

public class Inputs {
    // Create a new Java Application and then inside of your main method add
    // some code that will read from standard input a sentence and then prints the count
    // of the words that starts with a vowel. Each word that does not start with a vowel
    // should be skipped and an error message should be printed to show that.

    public static void main(String[] args) {
        int totalWords = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce a sentence:");
        String sentence = scanner.nextLine();
        String[] sentenceArr = sentence.split(" ");

        for (String word : sentenceArr) {
            if (startsWithVowel(word)) {
                totalWords++;
            } else {
                System.err.println("word skkiped: " + word);
            }
        }

        System.out.println("Total words that starts with a vowel: " + totalWords);
    }

    public static boolean startsWithVowel(String word) {
        String vowels = "aeiou";
        char firstLetter = word.toLowerCase().charAt(0);
        return vowels.indexOf(firstLetter) > -1;
    }
}
