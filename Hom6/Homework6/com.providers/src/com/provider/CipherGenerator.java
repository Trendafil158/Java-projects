package com.provider;

import com.service.Cipherable;

public class CipherGenerator {

    public static Result countDistinct(Cipherable cipher, int seed) {

        char[] resultRandomLetters = cipher.getSecretChars(seed);
        int i,j;
        int count;
        int numberUnique = 0;
        boolean[] flag = new boolean[resultRandomLetters.length];
        for(i=0; i<resultRandomLetters.length; i++){
            if(!flag[i]) {
                count = 1;
                for (j = i + 1; j < resultRandomLetters.length; j++) {
                    if (resultRandomLetters[j] == resultRandomLetters[i]) {
                        count++;
                        flag[j] = true;
                    }
                }
                if (count == 1) {
                    numberUnique++;
                }
            }
        }
        return new Result(resultRandomLetters, numberUnique);
    }
}
