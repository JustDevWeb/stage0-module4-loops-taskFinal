package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String side = "";
            int counter = cathetusLength;
            for (int j = 1; j <= cathetusLength * 2 - 1; j++) {
                if (counter <= i) {
                    side += counter;
                } else {
                    side += " ";
                }

                if (j < cathetusLength) {
                    counter--;
                } else {
                    counter++;
                }
            }
            String clearSide = side.stripTrailing();
            System.out.println(clearSide);
        }
    }



    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
