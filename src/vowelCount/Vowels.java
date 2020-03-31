package vowelCount;
public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        String vowels = "aeiou";

        for(int x = 0; x < str.length(); x++){
            for(int j = 0; j < vowels.length(); j++){
                if(str.charAt(x) == vowels.charAt(j)){
                    vowelsCount++;
                }
            }


        }
        return vowelsCount;
    }

}