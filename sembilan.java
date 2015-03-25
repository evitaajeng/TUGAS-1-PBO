/**
 * Created by TOSHIBA on 3/25/2015.
 */
public class sembilan {
    public static void main(String[] args) {
        int a = 1;
        int z = 110;
        int c;
        for (a = 1; a <= z; a++) {
            if (a % 5 == 0) {
                System.out.print("JONI");
            } else {
                System.out.print(a);
            }
            if (a < z) {
                System.out.print(" ");
                if (a % 11 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}