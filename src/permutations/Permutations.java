package permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Permutations {

    public static List<String> singlePermutations(String s) {
        if (s.length() == 0) {

            ArrayList<String> array = new ArrayList<>();
            array.add("");
            return array;
        }
        char chr = s.charAt(0);
        String subStr = s.substring(1);
        ArrayList<String> last = (ArrayList<String>) singlePermutations(subStr);
        Set<String> hashS = new HashSet<>();


        for (String val : last) {
            for (int i = 0; i <= val.length(); i++) {
                String actual = val.substring(0, i) + chr + val.substring(i);
                if (!last.contains(actual)) {
                    hashS.add(actual);
                }
            }
        }
        ArrayList<String> retrn = new ArrayList<>(hashS);
        return retrn;
    }
}