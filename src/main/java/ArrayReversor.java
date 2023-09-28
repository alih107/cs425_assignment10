public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor() {
        this.arrayFlattenerService = new ArrayFlattenerImpl();
    }

    public int[] reverseArray(int[][] arr) {
        int[] result = arrayFlattenerService.flatten2D(arr);
        if (result == null) {
            return null;
        }

        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = temp;
        }
        return result;
    }

    public void setArrayFlattenerService(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }
}
