package countingSheep;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {

        int count = 0;

        for (Boolean test : arrayOfSheeps) {
            if (test == true) {
                count++;
            }

        }
        return count;
    }
}