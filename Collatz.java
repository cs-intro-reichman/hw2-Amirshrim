
public class Collatz {

    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        String letter = args[1];
		if (!letter.equals("v") & !letter.equals("c") )
		{
			return;
		}
        if (letter.equals("v")) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
                int counter = 1;
                int seed = i;

                while (seed != 1 || counter == 1) {
                    if (seed % 2 == 0) {
                        seed = seed / 2;
                    } else {
                        seed = (seed * 3) + 1;
                    }

                    System.out.print(seed + " ");
                    counter++;
                }

                System.out.print("(" + counter + ")\n");

            }
        }
        System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
    }
}
