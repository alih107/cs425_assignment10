public class ArrayFlattener {
    public static int[] flatten2D(int[][] arr) {
        if (arr == null) {
            return null;
        }
        int count = 0;
        for (int[] ints: arr) {
            count += ints.length;
        }
        int[] result = new int[count];
        count = 0;
        for (int[] ints : arr) {
            System.arraycopy(ints, 0, result, count, ints.length);
            count += ints.length;
        }
        return result;
    }
}
