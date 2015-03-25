/**
 * Created by TOSHIBA on 3/25/2015.
 */
public class delapan {
    public static void main(String[] args) {
        int awal = 1;
        int akhir = 110;
        int z;

        for (awal = 1; awal <= akhir; awal++) {
            System.out.print(awal);
            if (awal < akhir) {
                System.out.print(" ");
            }
            if (awal % 11 == 0) {
                System.out.print("\n");
            }
        }
    }
}