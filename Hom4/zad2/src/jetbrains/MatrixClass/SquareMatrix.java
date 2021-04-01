package jetbrains.MatrixClass;

import java.util.Arrays;

public class SquareMatrix {

    private int[][] dataArray;

    public SquareMatrix()
    {
        setDataArray(null);
    }

    public SquareMatrix(int[][] constructDataArray)
    {
        setDataArray(constructDataArray);
    }

    public SquareMatrix(SquareMatrix constructCopyDataMatrix)
    {
        setDataArray(constructCopyDataMatrix.dataArray);
    }

    public int[][] getDataArray()
    {
        int[][] copyDataArray = new int[dataArray.length][dataArray.length];

        for(int i = 0; i < dataArray.length; i++)
        {
            for(int j = 0; j < dataArray.length; j++)
            {
                copyDataArray[i][j] = dataArray[i][j];
            }
        }
        return copyDataArray;
    }

    public void setDataArray(int[][] dataArray)
    {
        if(dataArray != null)
        {
            this.dataArray = new int[dataArray.length][dataArray.length];

            for(int i = 0; i < dataArray.length; i++)
            {
                for(int j = 0; j < dataArray.length; j++)
                {
                    this.dataArray[i][j] = dataArray[i][j];
                }
            }
        }
        else
        {
            this.dataArray = new int[0][0];
        }
    }

    public String toString()
    {
        return Arrays.deepToString(dataArray);
    }

    private int findMaxSum()
    {
        int k = 2;

        int[] arrayResult = new int[dataArray.length*dataArray.length];

        int indexForArrayResult = 0;

        for (int i = 0; i < dataArray.length - k + 1; i++) {

            for (int j = 0; j < dataArray.length - k + 1; j++) {
                int sum = 0;
                for (int p = i; p < k + i; p++) {
                    for (int q = j; q < k + j; q++) {
                        System.out.print("dataArray[" + p + "][" + q + "] = " + dataArray[p][q] + "," + " ");
                        sum += dataArray[p][q];
                    }
                }
                System.out.println();
                System.out.println("The sum of those numbers is: " + sum);
                arrayResult[indexForArrayResult] = sum;
                indexForArrayResult++;
                System.out.println();
            }
        }

        int maxSum = arrayResult[0];
        for(int i = 1; i < arrayResult.length; i++)
        {
            if(arrayResult[i] > maxSum)
            {
                maxSum = arrayResult[i];
            }
        }
        return maxSum;
    }

    public void printAll()
    {
        String result = toString();
        System.out.println(result);
        System.out.println("The largest sum of all sums is: " + findMaxSum());
    }
}
