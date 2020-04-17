package hammingNumbers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Hamming {
    public static long hamming(int n) {
        PriorityQueue<Long> minH = new PriorityQueue<Long>(Arrays.asList(2L, 3L, 5L));
        long smallest = 1;

        for (int i = 1; i < n; i++) {
            smallest =minH.poll();
            while (minH.peek() == smallest) {smallest = minH.poll();}
            minH.add(smallest * 2);
            minH.add(smallest * 3);
            minH.add(smallest * 5);
        }
        return smallest;
    }
}