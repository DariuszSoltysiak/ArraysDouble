public class ArraysDouble {
    public static void main(String[] args) {
        int[][] tablica2D = new int[10][10];
        for (int i = 0; i < tablica2D.length; i++) {
            for (int j = 0; j < tablica2D.length; j++) {
                tablica2D[i][j] = i * 10 + j;
                if (tablica2D[i][j] < 10) {
                    System.out.print("0" + tablica2D[i][j] + " ");
                } else {
                    System.out.print(tablica2D[i][j] + " ");
                }
            }System.out.println();
        }
    }
}