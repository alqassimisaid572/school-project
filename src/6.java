import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(10);
        System.out.println("Generated random number: " + num1);
    }
}
