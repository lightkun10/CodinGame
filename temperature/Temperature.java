import java.util.Scanner;

public class Temperature {
   
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // the number of temperatures to analyse

        int[] temperatures = new int[n]; // storing all temperatures

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            //System.out.print(t + " ");
            //if (t < 0) { t = (t - t) - t; }
            temperatures[i] = t;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


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

    // 42 -5 12 21 5 24 -5              ---> expected: 5, got: -5
    // -5 -4 -2 12 -40 4 2 18 11 5 -2   ---> expected: 2, got: -2
}