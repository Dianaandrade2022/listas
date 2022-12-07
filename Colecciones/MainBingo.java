package Colecciones;
public class MainBingo {
    public static void main(String[] args) throws Exception {

        final int NUM_BALLS = 75;
        final int NUM_PULLS = 10;

        ArraySet<BingoBall> bingo = new ArraySet<>();

        BingoBall ball;

        for (int num = 1; num <= NUM_BALLS; num++) {
            ball = new BingoBall(num);
            bingo.add(ball);
        }
        // System.out.println(bingo);

        System.out.println("Size: " + bingo.size());

        System.out.println();
        for (int num = 1; num <= NUM_BALLS; num++) {
            ball = bingo.removeRandom();
            System.out.println(ball);
        }

    }

}
