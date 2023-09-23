
import java.util.Random;
import java.util.Scanner;

public class SerialExperimentsString {

    public int findSymbolOccurance(String str, char a) {
        int c = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            if(a == charArray[i]) c++;
        }
        return c;
    }

    public int findWordPosition(String source, String target) {
        if(source.contains(target)) {
            return source.indexOf(target) + 1;
        }
        else return -1;
    }

    public String stringReverse(String str) {
        char[] charArray = str.toCharArray();
        String result = "";
        for (int i = charArray.length - 1; i >= 0 ; i--) {
            result += charArray[i];
        }
        return result;
    }

    public boolean isPalindrome(String str) {
        String check = stringReverse(str);
        return str.equals(check);
    }

    public void wordGame() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        System.out.println(word);
        char[] wordCharArray = word.toCharArray();
        String unknown = "###############";
        char[] unknownCharArray = unknown.toCharArray();
        boolean isGuessed = false;
        while(!isGuessed) {
            System.out.println("Guess the word!");
            String guess = scn.nextLine().toLowerCase().trim();
            char[] guessCharArray = guess.toCharArray();
            if(guess.equals(word)) {
                System.out.println("WIN!\nThe word is " + word);
                isGuessed = true;
            }
            else if(guessCharArray.length > 15) {
                System.out.println("Your guess is too long! Please, enter a value less than 15 characters.");
            }
            else {
                int length;
                String result = "";
                if(wordCharArray.length <= guessCharArray.length) {
                    length = wordCharArray.length;
                }
                else {
                    length = guessCharArray.length;
                }
                for (int i = 0; i < length; i++) {
                    if(wordCharArray[i] == guessCharArray[i]) unknownCharArray[i] = wordCharArray[i];
                }
                for (char c : unknownCharArray) {
                    result += c;
                }
                System.out.println("You have guessed these characters: " + result);
            }
        }
    }

}
