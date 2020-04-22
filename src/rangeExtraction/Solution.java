package rangeExtraction;

class Solution {
    static String rangeExtraction(final int[] array) {
        final StringBuilder theString = new StringBuilder();
        for (int x = 0; x < array.length; x++) {
            int rangeTest = array[x];
            theString.append(rangeTest);
            for (int y = x + 1; y <= array.length; y++) {
                if (y == array.length || array[y] != rangeTest + (y - x)) {
                    if (y - x >= 3) {
                        theString.append('-').append(array[y - 1]);
                        x = y - 1;
                    }
                    theString.append(',');
                    break;
                }
            }
        }
        String solution = theString.deleteCharAt(theString.length() - 1).toString();
        return solution;
    }
}