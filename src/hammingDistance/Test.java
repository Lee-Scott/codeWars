package hammingDistance;

import hammingNumbers.Hamming;
import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void Test1() {
        Assert.assertEquals(2, Solution.hammingDistance(1, 4));
        System.out.println(Solution.hammingDistance(1, 5));
    }
}
