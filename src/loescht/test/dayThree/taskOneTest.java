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
        assertEquals(3, taskOne.calcManhattanDist(12));
    }

    @Test
    public void testCaseThree() {
        assertEquals(2, taskOne.calcManhattanDist(23));
    }

    @Test
    public void testCaseFour() {
        assertEquals(1024, taskOne.calcManhattanDist(1024));
    }
}
