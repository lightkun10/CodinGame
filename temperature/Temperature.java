import java.util.Scanner;

public class Temperature {
   
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // the number of temperatures to analyse

        int[] temperatures = new int[n]; // storing all temperatures

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            temperatures[i] = t;
        }

        if (temperatures.length <= 0) {
            System.out.print("0");
            return;
        } 
        
        int closer = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            int ct = temperatures[i]; // current temperature

            if (Math.abs(ct) < Math.abs(closer)) {
                closer = ct;
            } else if (Math.abs(ct) == Math.abs(closer)) {
                // Pick the positive
                closer = (closer > ct) ? closer : ct;
            }

            System.out.println("Closer now: " + closer);
        }

        System.out.println(closer);
        
    }
}