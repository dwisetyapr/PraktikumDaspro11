import java.util.Scanner;
public class StudiKasus111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        
        System.out.println("Masukkan jumlah cup : ");
        jumlahCup = input.nextInt();
        System.out.println("Masukkan jumlah uang bayar : ");
        uangBayar = input.nextInt();

        totalHarga=jumlahCup*hargaPerCup;
        diskon=0;
        
        if (totalHarga >= 100000) {
            diskon=totalHarga*10/100;
        }
        totalBayar=totalHarga-diskon;

        System.out.println("Total harga                 : Rp "+totalHarga);
        System.out.println("Total diskon                : Rp "+diskon);
        System.out.println("Total bayar                 : Rp "+totalBayar);
        
        if (uangBayar >= totalBayar) {
            kembalian=uangBayar-totalBayar;
            System.out.println("Uang Kembalian              : Rp "+kembalian);
        } else {
            kurang=totalBayar-uangBayar;
            System.out.println("Uang tidak cukup, kurang    : Rp "+kurang);
        }
    }
}