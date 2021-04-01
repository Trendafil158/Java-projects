package com.provider;

public class Result {

    private char[] chars;
    private int data;

    public Result(char[] chars, int data) {
        setChars(chars);
        setData(data);
    }

    public char[] getChars() {
        return chars;
    }

    public int getData() {
        return data;
    }

    public void setChars(char[] chars) {

        if(chars != null)
        {
            this.chars = new char[chars.length];

            for(int i = 0; i < chars.length; i++)
            {
                this.chars[i] = chars[i];
            }
        }
        else
        {
            this.chars = new char[1];
        }
    }

    public void setData(int data) {
        this.data = data > 0 ? data : 5;
    }

    @Override
    public String toString() {

        String resultForChars = "";
        for(int i = 0; i < chars.length; i++)
        {
            resultForChars += String.format("chars[%d] = %c\n", i, chars[i]);
        }

        String resultForData = String.format("Data: %d", data);

       return resultForChars + resultForData;
    }
}
