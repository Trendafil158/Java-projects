package DistanceHamming;

import java.util.Scanner;

public class HammingDistance {

    public static void readingNumbersAndPrintingInBinaryType(byte number)
    {
        System.out.print("The numbers in bytes is: ");

        int displayMask = 1 << 7;

        for(int bit = 1; bit <= 8; bit++)
        {
            System.out.print((number & displayMask) == 0 ? '0' : '1');
            number <<= 1;

            if(bit % 4 == 0)
            {
                System.out.print(' ');
            }
        }
    }

    public static byte calculatingHammingDistance(byte firstNumber, byte secondNumber)
    {
        int content = firstNumber ^ secondNumber;
        byte setBits = 0;

        while(content > 0)
        {
            setBits += content & 1;
            content >>= 1;
        }

        return setBits;
    }

    public static void main(String[] args) {

        Scanner firstInput = new Scanner(System.in);
        System.out.print("Enter the first eight-bytes number: ");
        byte firstNumber = firstInput.nextByte();

        readingNumbersAndPrintingInBinaryType(firstNumber);

        System.out.println();

        Scanner secondInput = new Scanner(System.in);
        System.out.print("Enter the second eight-bytes number: ");
        byte secondNumber = secondInput.nextByte();

        readingNumbersAndPrintingInBinaryType(secondNumber);

        System.out.println();
        System.out.println();

        System.out.println("The hamming distance between these two numbers is: " + calculatingHammingDistance(firstNumber, secondNumber));
    }

}
