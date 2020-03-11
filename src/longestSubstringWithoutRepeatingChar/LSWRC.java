package longestSubstringWithoutRepeatingChar;

/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LSWRC {

    static final int CharsMax = 256;

    public LSWRC(String str) {
    }

    static int longestUniqueSubsttr(String str)
    {
        int n = str.length();
        int currentLength = 1; // length of current substring
        int maxLength = 1; // result
        int previousIndex; // previous index
        int i;
        int visited[] = new int[CharsMax];

        /* Initialize the visited array as -1, -1 is
         used to indicate that character has not been
         visited yet. */
        for (i = 0; i < CharsMax; i++) {
            visited[i] = -1;
        }

        /* Mark first character as visited by storing the
             index of first   character in visited array. */
        visited[str.charAt(0)] = 0;

        /* Start from the second character. First character is
           already processed (currentLength and maxLength are initialized
         as 1, and visited[str[0]] is set */
        for (i = 1; i < n; i++) {
            previousIndex = visited[str.charAt(i)];

            /* If the current character is not present in
           the already processed substring or it is not
              part of the current NRCS, then do currentLength++ */
            if (previousIndex == -1 || i - currentLength > previousIndex)
                currentLength++;

            /* If the current character is present in currently
               considered NRCS, then update NRCS to start from
               the next character of the previous instance. */
            else {
                /* Also, when we are changing the NRCS, we
                   should also check whether length of the
                   previous NRCS was greater than maxLength or
                   not.*/
                if (currentLength > maxLength)
                    maxLength = currentLength;

                currentLength = i - previousIndex;
            }

            // update the index of current character
            visited[str.charAt(i)] = i;
        }

        // Compare the length of last NRCS with maxLength and
        // update maxLength if needed
        if (currentLength > maxLength)
            maxLength = currentLength;

        return maxLength;
    }


}