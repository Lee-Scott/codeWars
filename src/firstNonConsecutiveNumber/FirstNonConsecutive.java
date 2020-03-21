package firstNonConsecutiveNumber;

public class FirstNonConsecutive {
    static Integer find(final int[] array){

        int lastNum = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] != (array[i-1]) + 1 ){
                return array[i];
            }
        }
        return null;
    }
}
