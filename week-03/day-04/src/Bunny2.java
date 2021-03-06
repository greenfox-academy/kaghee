public class Bunny2 {
    public static void main(String[] args) {
        // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
        // (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
        // have 3 ears, because they each have a raised foot. Recursively return the
        // number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

        System.out.println(bunnyEarCount(7));
    }

    public static int bunnyEarCount(int bunnies) {
        int ears = 2;
        if (bunnies == 1) {
            return ears;
        } else {
            ears += bunnyEarCount(bunnies - 1);
            if (bunnies % 2 == 0) {
                ears++;
            }
            return ears;
        }
    }
}
