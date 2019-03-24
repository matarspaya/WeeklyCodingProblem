package clockwise;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by spayam on 24-Mar-19.
 */
public class ClockwiseSpiralTest {


    int[][] array = {{1, 2, 3, 4, 5},
        {6, 7, 8, 9, 10},
        {11, 12, 13, 14, 15},
        {16, 17, 18, 19, 20}};

    int[] resultArray = {1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12};

    @Test
    public void clockwiseSpiralTest() {
        ClockwiseSpiral clockwiseSpiral = new ClockwiseSpiral();
        int[] ints = clockwiseSpiral.printArrayClockwise(this.array);
        Assert.assertTrue(Arrays.equals(ints, resultArray));
    }
}
