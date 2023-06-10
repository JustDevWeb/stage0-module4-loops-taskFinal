package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        if (numberToPrint != 0) {
        int result = numberToPrint;
        for (int i = 1; i < power; i++ ) {
            result *= numberToPrint;
        }
        System.out.println(result);
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
