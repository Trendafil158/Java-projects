package jetbrains.MatrixClass;

import java.util.Random;

public class SquareMatrixTest {

    public static void main(String[] args) {

        int minimumForArrayLength = 2;
        int maximumForArrayLength = 12;
        Random randomNumberForArrayLength = new Random();
        int numberForArrayLength = randomNumberForArrayLength.nextInt((maximumForArrayLength - minimumForArrayLength) + 1) + minimumForArrayLength;

        System.out.println("The length of the matrix is: " + numberForArrayLength);
        int[][] matrix = new int[numberForArrayLength][numberForArrayLength];

        int maximumNumberForArrayElements = 8;
        Random randomNumberForArrayElements = new Random();

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
            {
                int numberForArrayElements = randomNumberForArrayElements.nextInt(maximumNumberForArrayElements);
                matrix[i][j] = numberForArrayElements;
            }
        }

        SquareMatrix testMatrixObject = new SquareMatrix(matrix);
        testMatrixObject.printAll();
    }
}
