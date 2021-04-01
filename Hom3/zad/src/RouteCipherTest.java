public class RouteCipherTest {

    public static void main(String[] args) {

        RouteCipher myRouteCipher = new RouteCipher(-5);
        System.out.println("The encrypted message, following the route is:");
        myRouteCipher.encrypt("ABORT THE MISSION, YOU HAVE BEEN SPOTTED");

    }

}
