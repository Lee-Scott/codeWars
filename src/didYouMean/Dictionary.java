package didYouMean;
/*
I'm sure, you know Google's "Did you mean ...?", when you entered a search term and mistyped a word. In this kata we want to implement something similar.

You'll get an entered term (lowercase string) and an array of known words (also lowercase strings). Your task is to find out, which word from the dictionary is most similar to the entered one. The similarity is described by the minimum number of letters you have to add, remove or replace in order to get from the entered word to one of the dictionary. The lower the number of required changes, the higher the similarity between each two words.

Same words are obviously the most similar ones. A word that needs one letter to be changed is more similar to another word that needs 2 (or more) letters to be changed. E.g. the mistyped term berr is more similar to beer (1 letter to be replaced) than to barrel (3 letters to be changed in total).

Extend the dictionary in a way, that it is able to return you the most similar word from the list of known words.

Code Examples:

Dictionary fruits = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});

fruits.findMostSimilar("strawbery"); // must return "strawberry"
fruits.findMostSimilar("berry"); // must return "cherry"

Dictionary things = new Dictionary(new String[]{"stars", "mars", "wars", "codec", "codewars"});
things.findMostSimilar("coddwars"); // must return "codewars"

Dictionary languages = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
languages.findMostSimilar("heaven"); // must return "java"
languages.findMostSimilar("javascript"); // must return "javascript" (same words are obviously the most similar ones)
I know, many of you would disagree that java is more similar to heaven than all the other ones, but in this kata it is ;)

Additional notes:

there is always exactly one possible correct solution
 */

public class Dictionary {

    private final String[] theDictionary;

    public Dictionary(String[] words) {
        this.theDictionary = words;
    }

    public String findMostSimilar(String testedWord) {
        int theMin = findDistance(testedWord, theDictionary[0]);
        String result = theDictionary[0];
        for (int x = 1; x < theDictionary.length; x++) {
            int norm = findDistance(testedWord, theDictionary[x]);
            if (norm < theMin) {
                theMin = norm;
                result = theDictionary[x];
            }
        }
        return result;
    }

    private static int findDistance(String testedWord, String dictionaryWord) {
        int[][] distance = new int[testedWord.length() + 1][dictionaryWord.length() + 1];

        for (int x = 0; x <= testedWord.length(); x++) {
            distance[x][0] = x;
        }
        for (int y = 1; y <= dictionaryWord.length(); y++) {
            distance[0][y] = y;
        }
        for (int a = 1; a <= testedWord.length(); a++) {
            for (int b = 1; b <= dictionaryWord.length(); b++) {
                distance[a][b] = findMin(distance[a][b - 1] + 1,
                        distance[a - 1][b] + 1,
                        distance[a - 1][b - 1] + (testedWord.charAt(a - 1) == dictionaryWord.charAt(b - 1) ? 0 : 1));
            }
        }
        return distance[testedWord.length()][dictionaryWord.length()];

    }
    private static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}