package net.teraiya;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    @Test
    public void testFiboRecursion() throws Exception {
        Problem2 p2 = new Problem2();
        assertEquals(144, p2.fiboRecursion(12));
    }

    @Test
    public void testFindEvenValueSumForFibo() throws Exception {
        Problem2 p2 = new Problem2();
        p2.findEvenValueSumForFiboUnderFourMillion();
    }
}