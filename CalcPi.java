public class CalcPi {
    public static void main(String [] args) { 
        int num = Integer.parseInt(args[0]);
        double sum = 1.0; 
        int rational = 3; 
        for (int i = 1; i < num; i++) {
            if (i % 2 != 0) {
                sum = sum - (1.0 / rational); 
            }
            else {
                sum = sum + 1.0 / rational; 
            }
            
			rational = rational + 2;
        }
        
		if (sum!=1){
        sum = sum * 4.0;
		}
        System.out.println("pi according to Java:  " + Math.PI);
        System.out.println("pi, approximated:  " + sum);
    }
}