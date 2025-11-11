

public class Collatz {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		String letter = args[1];
		int counter=1;
		for (int i = 1; i <= num; i++){
			int seed=i;
			while(seed!=1){
				if(seed % 2==0){
					System.out.print(seed + " ");
					seed = seed/2;
					
				}
				else{
					System.out.print(seed + " ");
					seed= (seed*3) + 1;
				}
				counter++;
			}
			
			}
			


			

		}

	}

