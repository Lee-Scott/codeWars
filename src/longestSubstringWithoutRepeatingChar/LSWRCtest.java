package longestSubstringWithoutRepeatingChar;

import static longestSubstringWithoutRepeatingChar.LSWRC.longestUniqueSubsttr;

public class LSWRCtest {
    public static void main(String[] args)
    {
        String strOne = "abcabcbb";
        System.out.println("The input string is " + strOne);
        int len =  longestUniqueSubsttr(strOne);
        System.out.println("The length of "
                + "the longest non repeating character is " + len);

        String strTwo = "bbbbb";
        System.out.println("The input string is " + strTwo);
        int lenTwo = longestUniqueSubsttr(strTwo);
        System.out.println("The length of "
                + "the longest non repeating character is " + lenTwo);

        String strThree = "pwwkew";
        System.out.println("The input string is " + strThree);
        int lenThree = longestUniqueSubsttr(strThree);
        System.out.println("The length of "
                + "the longest non repeating character is " + lenThree);
    }
}
