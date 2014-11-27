package net.teraiya;

import org.junit.Test;

import static org.junit.Assert.*;

public class Problem1Test {

    @Test
    public void testFindSumOf3and5() throws Exception {
        Problem1 p1 = new Problem1();
        assertEquals(233168, p1.findSumOf3and5());
    }
}