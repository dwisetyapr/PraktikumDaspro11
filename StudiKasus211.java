import java.util.Scanner;
public class StudiKasus211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaanPKM;

        System.out.println("Masukkan nama : ");
        namaMahasiswa = input.nextLine();
        System.out.println("Jenis kegiatan (Belmawa/Bakorma/Mandiri/Pkm/Lainnya): ");
        jenisKegiatan = input.nextLine();
        System.out.println("Jumlah dokumen : ");
        jumlahDokumen = input.nextInt();

        int peringkat = 0, statusPendanaan = 0;
        
        if (jenisKegiatan.equalsIgnoreCase("Belmawa")) || (jenisKegiatan.equalsIgnoreCase("Bakorma")) || (jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.println("Peringkat juara : ");
            peringkat=input.nextInt();
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.println("Status pendanaan (1=lolos, 0=tidak lolos) : ");
            statusPendanaan=input.nextInt();
        }

        if (jenisKegiatan.equalsIgnoreCase("Belmawa")) || (jenisKegiatan.equalsIgnoreCase("Bakorma")) || (jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            if (peringkat >= 1 && peringkat <=3) {
                if (jumlahDokumen == 4){
                    System.out.println("Status : Dana diberikan karena telah memenuhi syarat");
                } else {
                    int kurangDokumen = 4 - jumlahDokumen;
                    System.out.println("Status : Dana tidak diberikan karena dokumen tidak lengkap (kurang "+kurangDokumen")");
                }
            } else {
                System.out.println("Status : Dana tidak diberikan karena bukan peraih juara 1,2, atau 3");
            }
        }
    }
}
