import java.net.SocketTimeoutException;

public class App {
    public static void main(String[] args) {
        TripleTacoBox tacoBarria = new TripleTacoBox();
        tacoBarria.eat();
        System.out.println("Tacos Remaining: " + tacoBarria.tacosRemaining());
    }
}
