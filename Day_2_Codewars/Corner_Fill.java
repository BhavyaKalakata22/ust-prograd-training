public class Solution{
    public static int[] cornerFill(int[][] square) {
        int[] array = new int[square.length * square.length];
        int index = 0;
        for (int i = 0; i < square.length; i++) {
            if ((i & 1) != 0) {
                for (int j = square.length - 1; j > i; j--) {
                    array[index++] = square[j][square.length - i - 1];
                }
                for (int j = square.length - i; j > 0; j--) {
                    array[index++] = square[i][j - 1];
                }
            } else {
                for (int j = 0; j < square.length - i; j++) {
                    array[index++] = square[i][j];
                }
                for (int j = i + 1; j < square.length; j++) {
                    array[index++] = square[j][square.length - i - 1];
                }
            }
        }
        return array;
    }
}


