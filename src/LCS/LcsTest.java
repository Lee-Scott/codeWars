package LCS;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class LcsTest {
    @Test
    public void fixedTests() {
        //
        assertEquals("", Lcs.lcs("", ""));
        assertEquals("", Lcs.lcs("abc", ""));
        assertEquals("", Lcs.lcs("", "abc"));
        assertEquals("", Lcs.lcs("a", "b"));
        assertEquals("a", Lcs.lcs("a", "a"));
        assertEquals("ac", Lcs.lcs("abc", "ac"));
        assertEquals("abc", Lcs.lcs("abcdef", "abc"));
        assertEquals("acf", Lcs.lcs("abcdef", "acf"));
        assertEquals("nottest", Lcs.lcs("anothertest", "notatest"));
        assertEquals("12356", Lcs.lcs("132535365", "123456789"));
        assertEquals("final", Lcs.lcs("nothardlythefinaltest", "zzzfinallyzzz"));
        assertEquals("acdefghijklmnoq", Lcs.lcs("abcdefghijklmnopq", "apcdefghijklmnobq"));

        assertEquals("", LcsRecurstion.lcs("", ""));
        assertEquals("", LcsRecurstion.lcs("abc", ""));
        assertEquals("", LcsRecurstion.lcs("", "abc"));
        assertEquals("", LcsRecurstion.lcs("a", "b"));
        assertEquals("a", LcsRecurstion.lcs("a", "a"));
        assertEquals("ac", LcsRecurstion.lcs("abc", "ac"));
        assertEquals("abc", LcsRecurstion.lcs("abcdef", "abc"));
        assertEquals("acf", LcsRecurstion.lcs("abcdef", "acf"));
        assertEquals("nottest", LcsRecurstion.lcs("anothertest", "notatest"));
        assertEquals("12356", LcsRecurstion.lcs("132535365", "123456789"));
        assertEquals("final", LcsRecurstion.lcs("nothardlythefinaltest", "zzzfinallyzzz"));
        assertEquals("acdefghijklmnoq", LcsRecurstion.lcs("abcdefghijklmnopq", "apcdefghijklmnobq"));
    }
}