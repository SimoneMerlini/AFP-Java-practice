import java.util.Random;

public class test {

    public static void main(String[] args) {
        int[] run = new int[20];
        Random generator = new Random();

        for (int i = 0; i < run.length; i++) {
            run[i] = generator.nextInt(10) + 1;
        }

        String toString = "";

        for (int i = 0; i < run.length; i++) {
            if (i + 1 < run.length && run[i] == run[i + 1]) {
                toString += "( ";
            }
            toString += run[i] + " ";
            if (i > 0 && run[i] == run[i - 1]) {
                toString += ") ";
            }
        }

        System.out.println(toString);
    }
}