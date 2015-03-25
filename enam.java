/**
 * Created by TOSHIBA on 3/24/2015.
 */
public class enam {
    public static void main(String[] args) {
        int pertama=1;
        int terakhir=30;
        int jumlah=0;
        System.out.println("Angka yang pertama = "+pertama);
        System.out.println("Angka yang terakhir = "+terakhir);
        System.out.println("Jumlah dari deretan angka diatas = ");

        while(pertama<=terakhir){
            jumlah=jumlah+pertama;
            pertama++;
        }
        System.out.println(jumlah);
    }
}