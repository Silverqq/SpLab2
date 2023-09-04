public class MaxR {

    public static void main(String[] args) {
        int[] sequence = generateSequence();
        int minR = findMinR(sequence);

        System.out.println("Min R: " + minR);
    }

    private static int[] generateSequence() {
        int[] sequence = new int[1000];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = (int) (Math.random() * 10001); // генерируем случайное число от 0 до 10000
        }
        return sequence;
    }

    private static int findMinR(int[] sequence) {
        int minR = -1;

        for (int i = 0; i < sequence.length; i++) {
            for (int j = i + 1; j < sequence.length; j++) {
                int product = sequence[i] * sequence[j];
                if (product % 21 == 0 && (minR == -1 || product < minR)) {
                    minR = product;
                }
            }
        }

        return minR;
    }
}