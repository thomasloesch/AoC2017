package loescht.test.dayThree;


import loescht.advent.dayThree.taskOne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class taskOneTest {

    @Test
    public void testCaseOne() {
        assertEquals(0, taskOne.calcManhattanDist(1));
    }

    @Test
    public void testCaseTwo() {
        assertEquals(1, taskOne.calcManhattanDist(2));
    }

    @Test
    public void testCaseThree() {
        assertEquals(2, taskOne.calcManhattanDist(3));
    }

    @Test
    public void testCaseFour() {
        assertEquals(1, taskOne.calcManhattanDist(4));
    }

    @Test
    public void testCaseFive() {
        assertEquals(2, taskOne.calcManhattanDist(5));
    }

    @Test
    public void testCaseTen() {
        assertEquals(3, taskOne.calcManhattanDist(10));
    }

    @Test
    public void testCaseEleven() {
        assertEquals(2, taskOne.calcManhattanDist(11));
    }

    @Test
    public void testCaseTwelve() {
        assertEquals(3, taskOne.calcManhattanDist(12));
    }

    @Test
    public void testCaseThirteen() {
        assertEquals(4, taskOne.calcManhattanDist(13));
    }

    @Test
    public void testCaseTwentyThree() {
        assertEquals(2, taskOne.calcManhattanDist(23));
    }

    @Test
    public void testCaseOneThousandTwentyFour() {
        assertEquals(31, taskOne.calcManhattanDist(1024));
    }
}
