public class Upr15 {
    public static void main(String[] args) {

        int[][] matrix = {
                { 0, 2, 4, 0, 9, 5 },
                { 7, 1, 3, 3, 2, 1 },
                { 1, 3, 9, 8, 5, 6 },
                { 4, 6, 7, 9, 1, 0 }
        };

        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[0].length - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]+matrix[row][col+2] + matrix[row+1][col]
                        + matrix[row + 1][col+1] + matrix[row + 1][col + 2]+matrix[row+2][col]
                        + matrix[row + 2][col+1]+ matrix[row + +2][col + 2];
                if (sum > bestSum) 
                { 
                    bestSum = sum;
                    bestRow = row; 
                    bestCol = col;
                }
            }
        }

        System.out.println("Best result: ");
        System.out.println( matrix[bestRow][bestCol]+" "+ matrix[bestRow][bestCol + 1]+ " " + matrix[bestRow][bestCol + 2]);
        System.out.println( matrix[bestRow+1][bestCol] + " " + matrix[bestRow+1][bestCol + 1]+ " " + matrix[bestRow+1][bestCol + 2]);
        System.out.println( matrix[bestRow+2][bestCol] + " " + matrix[bestRow+2][bestCol + 1]+ " " + matrix[bestRow+2][bestCol + 2]);
        System.out.printf("Max sum : %d%n", bestSum);
    }
}