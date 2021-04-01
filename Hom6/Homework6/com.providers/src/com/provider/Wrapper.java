package com.provider;

import com.service.Cipherable;

import java.util.Random;

public class Wrapper {

    private int size;

    public Wrapper(int size) {
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size <= 0 ? 15 : size;
    }

    public class FixedRandom implements Cipherable {

         public char[] getSecretChars(int seed)
         {
             Random helpRandomNumber = new Random();
             helpRandomNumber.setSeed(seed);

             char[] resultRandomLetters = new char[size];

             for(int i = 0; i < resultRandomLetters.length; i++)
             {
                 char symbolForLetter = (char) (helpRandomNumber.nextInt(26) + 'A');
                 resultRandomLetters[i] = symbolForLetter;
             }
             return resultRandomLetters;
         }
    }

    public class FixedSelection implements Cipherable {

        public char[] getSecretChars(int seed)
        {
            Random randomHelp = new Random();

            char[] resultRandomLetters = new char[size];
            char[] storingAlphabet = new char[seed];

            for(int i = 0; i < storingAlphabet.length; i++)
            {
                char symbolForLetter = (char) (randomHelp.nextInt(26) + 'A');
                storingAlphabet[i] = symbolForLetter;
            }

            for(int i = 0; i < resultRandomLetters.length; i++)
            {
                int j = randomHelp.nextInt(seed);
                resultRandomLetters[i] = storingAlphabet[j];
            }
            return resultRandomLetters;
        }
    }

    public Cipherable makeFixedRandom()
    {
        return new FixedRandom();
    }

    public Cipherable makeFixedSelection()
    {
        return new FixedSelection();
    }
}
