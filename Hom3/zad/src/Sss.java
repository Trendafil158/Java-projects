public class Sss {

    static byte hammingDistance(byte n1, byte n2)
    {
        int x = n1 ^ n2;
        byte setBits = 0;

        while (x > 0)
        {
            setBits += x & 1;
            x >>= 1;
        }

        return setBits;
    }

    public static void main(String[] args) {

        byte n = 9, m = 14;
        System.out.println(hammingDistance(n, m));
    }
}
