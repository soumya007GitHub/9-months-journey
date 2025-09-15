public class SpiralMatrix {
    public static void main(String args[]) {
        int array[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int startRow = 0;
        int startColumn = 0;
        int endRow = array.length - 1;          // ✅ fixed
        int endColumn = array[0].length - 1;    // ✅ fixed

        while (startRow <= endRow && startColumn <= endColumn) {
            // Top row
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.print(array[startRow][i] + " ");
            }

            // Right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(array[i][endColumn] + " ");
            }

            // Bottom row
            if (startRow < endRow) { // ✅ avoid duplicate row
                for (int i = endColumn - 1; i >= startColumn; i--) {
                    System.out.print(array[endRow][i] + " ");
                }
            }

            // Left column
            if (startColumn < endColumn) { // ✅ avoid duplicate column
                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(array[i][startColumn] + " ");
                }
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
    }
}
