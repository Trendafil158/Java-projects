import java.util.Stack;

public class RouteCipher {

    private int key;

    public RouteCipher(int myKey)
    {
        setKey(myKey);
    }

    public int getKey()
    {
        return key;
    }

    public void setKey(int otherKey) { key = otherKey; }

    private void encryptingFromTopLeft(int endRowIndex, int endColumnIndex, char[][] arr)
    {
        int i, startRowIndex = 0, startColumnIndex = 0;

        int count = 0;

        int total = endRowIndex * endColumnIndex;

        while (startRowIndex < endRowIndex && startColumnIndex < endColumnIndex)
        {
            if (count == total)
            {
                break;
            }

            for (i = startRowIndex; i < endRowIndex; ++i)
            {
                System.out.print(arr[i][startColumnIndex] + " ");
                count++;
            }
            startColumnIndex++;

            if (count == total)
            {
                break;
            }

            for (i = startColumnIndex; i < endColumnIndex; ++i)
            {
                System.out.print(arr[endRowIndex - 1][i] + " ");
                count++;
            }
            endRowIndex--;

            if (count == total)
            {
                break;
            }

            for (i = endRowIndex - 1; i >= startRowIndex; --i)
            {
                System.out.print(arr[i][endColumnIndex - 1] + " ");
                count++;
            }
            endColumnIndex--;

            if (count == total)
            {
                break;
            }

            for (i = endColumnIndex - 1; i >= startColumnIndex; --i)
            {
                System.out.print(arr[startRowIndex][i] + " ");
                count++;
            }
            startRowIndex++;
        }
    }

    private void decryptingFromTopLeft(int endRowIndex, int endColumnIndex, char[][] arr)
    {
        int i, startRowIndex = 0, startColumnIndex = 0;

        Stack<Character> myStack = new Stack<Character>();

        while (startRowIndex < endRowIndex && startColumnIndex < endColumnIndex)
        {
            for (i = startRowIndex; i < endRowIndex; ++i)
            {
                myStack.add(arr[i][startColumnIndex]);
            }
            startColumnIndex++;

            for (i = startColumnIndex; i < endColumnIndex; ++i)
            {
                myStack.add(arr[endRowIndex - 1][i]);
            }
            endRowIndex--;

            for (i = endRowIndex - 1; i >= startRowIndex; --i)
            {
                myStack.add(arr[i][endColumnIndex - 1]);
            }
            endColumnIndex--;

            for (i = endColumnIndex - 1; i >= startColumnIndex; --i)
            {
                myStack.add(arr[startRowIndex][i]);
            }
            startRowIndex++;
        }

        while(!myStack.empty())
        {
            System.out.print(myStack.peek() + " ");
            myStack.pop();
        }
    }

    private void encryptingFromBottomRight(int endRowIndex, int endColumnIndex, char[][] arr)
    {
        int i, startRowIndex = 0, startColumnIndex = 0;
        int count = 0;
        int total = endRowIndex * endColumnIndex;


        while(startRowIndex < endRowIndex && startColumnIndex < endColumnIndex)
        {
            if (count == total)
            {
                break;
            }

            for(i = endRowIndex - 1; i > startRowIndex; --i)
            {
                System.out.print(arr[i][endColumnIndex - 1] + " ");
                count++;
            }
            endColumnIndex--;

            if (count == total)
            {
                break;
            }

            for(i = endColumnIndex; i >= startColumnIndex; --i)
            {
                System.out.print(arr[startRowIndex][i] + " ");
                count++;
            }
            startRowIndex++;

            if (count == total)
            {
                break;
            }

            for(i = startRowIndex; i < endRowIndex; ++i)
            {
                System.out.print(arr[i][startColumnIndex] + " ");
                count++;
            }
            startColumnIndex++;

            if (count == total)
            {
                break;
            }

            for(i = startColumnIndex; i <= endColumnIndex - 1; ++i)
            {
                System.out.print(arr[endRowIndex - 1][i] + " ");
            }
            endRowIndex--;
        }
    }

    private void decryptingFromBottomRight(int endRowIndex, int endColumnIndex, char arr[][])
    {
        int i, startRowIndex = 0, startColumnIndex = 0;

        Stack<Character> myStack = new Stack<Character>();

        while(startRowIndex < endRowIndex && startColumnIndex < endColumnIndex)
        {

            for(i = endRowIndex - 1; i > startRowIndex; --i)
            {
                myStack.add(arr[i][endColumnIndex - 1]);
            }
            endColumnIndex--;


            for(i = endColumnIndex; i >= startColumnIndex; --i)
            {
                myStack.add(arr[startRowIndex][i]);
            }
            startRowIndex++;


            for(i = startRowIndex; i < endRowIndex; ++i)
            {
                myStack.add(arr[i][startColumnIndex]);
            }
            startColumnIndex++;

            for(i = startColumnIndex; i <= endColumnIndex - 1; ++i)
            {
                myStack.add(arr[endRowIndex - 1][i]);
            }
            endRowIndex--;
        }

        while(!myStack.empty())
        {
            System.out.print(myStack.peek() + " ");
            myStack.pop();
        }
    }

    public String toString(char[] someText)
    {
        String text = new String(someText);
        return text;
    }

   public String encrypt(String plaintext)
    {
        plaintext = plaintext.replaceAll("[\\W]", "");
        char[] cipherTextChars = plaintext.toCharArray();
        int k = 0;
        int row = Math.abs(key) + 2;
        int column = cipherTextChars.length / Math.abs(key) - 1;
        char[][] grid = new char[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (k < cipherTextChars.length) {
                    grid[i][j] = cipherTextChars[k];
                    k++;
                } else {
                    grid[i][j] = 'X';
                }
            }
        }

        if(key > 0)
        {
            encryptingFromTopLeft(row, column, grid);
        }
        else if(key < 0)
        {
            encryptingFromBottomRight(row, column, grid);
        }

        int w = 0;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                cipherTextChars[w] = grid[i][j];
                k++;
            }
        }
        return toString(cipherTextChars);
    }

    public String decrypt(String plaintext)
    {
        plaintext = plaintext.replaceAll("[\\W]", "");
        char[] cipherTextChars = plaintext.toCharArray();
        int k = 0;
        int row = Math.abs(key) + 2;
        int column = cipherTextChars.length / Math.abs(key) - 1;
        char[][] grid = new char[row][column];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (k < cipherTextChars.length) {
                    grid[i][j] = cipherTextChars[k];
                    k++;
                } else {
                    grid[i][j] = 'X';
                }
            }
        }

        if(key > 0)
        {
            decryptingFromTopLeft(row, column, grid);
        }
        else if(key < 0)
        {
            decryptingFromBottomRight(row, column, grid);
        }

        int w = 0;
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                cipherTextChars[w] = grid[i][j];
                k++;
            }
        }
        return toString(cipherTextChars);
    }
}
