import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("assignment 10 started");
        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8}
        };
        System.out.println(Arrays.toString(ArrayFlattener.flatten2D(arr1)));

        ArrayReversor arrayReversor = new ArrayReversor();
        System.out.println(Arrays.toString(arrayReversor.reverseArray(arr1)));
    }
}
