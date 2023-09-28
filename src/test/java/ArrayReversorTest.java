import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertArrayEquals;

@RunWith(MockitoJUnitRunner.class)
public class ArrayReversorTest {

    @InjectMocks
    ArrayReversor arrayReversor = new ArrayReversor();
    @Mock
    ArrayFlattenerService arrayFlattenerServiceMock;

    @Test
    public void testNormalArray_withMock() {
        int[][] input ={
                {1, 2, 3, 4},
                {5, 6, 7},
                {8}
        };
        int[] flattenExpected = {1, 2, 3, 4, 5, 6, 7, 8};
        when(arrayFlattenerServiceMock.flatten2D(input)).thenReturn(flattenExpected);

        int[] expected = {8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, arrayReversor.reverseArray(input));
    }

    @Test
    public void testNullArray_withMock() {
        when(arrayFlattenerServiceMock.flatten2D(null)).thenReturn(null);
        assertArrayEquals(null, arrayReversor.reverseArray(null));
    }
}
