import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int n, r, nR;
        int nFac = 1, rFac = 1, nrFac = 1;
        int komb;
        int total = 1;
        int i = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Kümenin Eleman Sayısını Giriniz:");
        n = input.nextInt();
        System.out.print("2. Kümenin Eleman Sayısını Giriniz:");
        r = input.nextInt();


        while (i <= n) {
            nFac = total * i;
            i++;
        }
        while (i <= r) {
            rFac = total * i;
            i++;
        }
        nR = n-r;
        while (i <= nR) {
            nrFac = total * i;
            i++;
        }
        komb = nFac / (rFac * nrFac);
        System.out.print("Kombinasyon:"+ komb);


    }
}
