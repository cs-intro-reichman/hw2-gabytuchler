public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0); 
		if (mode == 'v')
		{
			for (int seed = 1; seed <= N; seed++)
			{

			while (seed != 1) {
				System.out.print(seed);
				if (seed % 2 == 0) {
					seed = seed / 2;
				} else {
					seed = 3 * seed + 1;
				}
				}
				System.out.print("," + seed);


			}
			if (mode == 'v')
				System.out.println();
		}
		System.out.println( "Every one of the first " + N + " hailstone sequences reched 1.");

		}
	}
