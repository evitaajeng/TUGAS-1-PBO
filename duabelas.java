/**
 * Created by TOSHIBA on 3/25/2015.
 */
public class duabelas {
    public static void main(String[] args) {
        int r;
        int s;
        int panjang=8;
        int lebar=12;

        for(r=1;r<=lebar;r++){
            if(r%2==0){
                System.out.print(" ");
            }
            for(s=1;s<=panjang;s++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}