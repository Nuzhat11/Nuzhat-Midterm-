package math;

public class MakePyramid {

    public static void main(String[] args) {


        for (int x = 7; x > 0; x--) {
            int y = 0;
            for (y = 0; y < x; y++) {
                System.out.print(" ");
            }
            for (int z = y; z < 7; z++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }
    }
}
