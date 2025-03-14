public class RandomCode {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
