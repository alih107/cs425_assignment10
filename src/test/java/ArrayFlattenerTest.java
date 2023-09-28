import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayFlattenerTest {
    @Test
    public void testNormalArray() {
        int[][] input ={
                {1, 2, 3, 4},
                {5, 6, 7},
                {8}
        };
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, ArrayFlattener.flatten2D(input));
    }

    @Test
    public void testNullArray() {
        assertArrayEquals(null, ArrayFlattener.flatten2D(null));
    }
}
