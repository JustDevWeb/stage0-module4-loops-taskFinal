package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int spaces = cathetusLength - 1;
        for(int i = 1; i <= cathetusLength; i++) {
            String side = "";
            for(int j = 1; j <= cathetusLength; j++) {
                if(j > spaces) {
                    side += "*";
                } else {
                    side += " ";
                }
            }
            spaces--;
            System.out.println(side);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
