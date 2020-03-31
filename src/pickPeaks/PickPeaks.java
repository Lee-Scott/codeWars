package pickPeaks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

    public static Map<String,List<Integer>> getPeaks(int[] arr) {

        Map<String, List<Integer>> result = new HashMap<>();
        result.put("pos", new ArrayList<>());
        result.put("peaks", new ArrayList<>());

        int peakPos = 0; // the position of the peak
        boolean increasing = false; // test to see if the numbers keep increasing

        for (int x = 1 ; x < arr.length ; x++) {
            if (arr[x-1] < arr[x]) { // if the numbers are still increasing
                increasing = true;
                peakPos = x;
            }
            if (increasing && arr[x-1] > arr[x]) { // if it has been increasing but is not anymore
                increasing = false;
                result.get("pos").add(peakPos);
                result.get("peaks").add(arr[peakPos]);
            }
        }
        return result;
    }
}