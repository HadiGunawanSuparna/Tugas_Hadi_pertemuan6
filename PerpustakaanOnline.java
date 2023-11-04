import java.util.ArrayList;

class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int tahun;
    int kategori;

    public Buku(String judul, String pengarang, String penerbit, int tahun, int kategori) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.kategori = kategori;
    }
}

public class PerpustakaanOnline {
    public static void main(String[] args) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        daftarBuku.add(new Buku("PBO dengan Java", "Abdul Kadir", "Erlangga", 2008, 1));
        daftarBuku.add(new Buku("Dasar Pemrograman", "Indrijani", "Erlangga", 2020, 1));
        daftarBuku.add(new Buku("Si Doel", "Indrijani", "Balai Pustaka", 1932, 3));

        System.out.println("======================================================================================");
        System.out.println("Daftar Buku Java yang Tersedia");
        System.out.println("======================================================================================");
        System.out.println("No  Judul                  Pengarang      Penerbit        Tahun  Kategori");
        System.out.println("======================================================================================");

        int bukuTeknik = 0;
        int bukuManajemen = 0;
        int bukuFiksi = 0;
        int bukuLainnya = 0;
        int bukuLawas = 0;
        int bukuBaru = 0;

        for (int i = 0; i < daftarBuku.size(); i++) {
            Buku buku = daftarBuku.get(i);
            System.out.printf("%-3d %-20s %-14s %-14s %d     ", (i + 1), buku.judul, buku.pengarang, buku.penerbit, buku.tahun);

            switch (buku.kategori) {
                case 1:
                    System.out.println("Teknik");
                    bukuTeknik++;
                    break;
                case 2:
                    System.out.println("Manajemen");
                    bukuManajemen++;
                    break;
                case 3:
                    System.out.println("Fiksi");
                    bukuFiksi++;
                    break;
                default:
                    System.out.println("Lainnya");
                    bukuLainnya++;
                    break;
            }

            if (buku.tahun < 2000) {
                bukuLawas++;
            } else {
                bukuBaru++;
            }
        }

        System.out.println("Jumlah buku yang tersedia : " + daftarBuku.size());
        System.out.println("Buku Teknik : " + bukuTeknik);
        System.out.println("Buku Manajemen : " + bukuManajemen);
        System.out.println("Buku Fiksi : " + bukuFiksi);
        System.out.println("Buku Lainnya : " + bukuLainnya);
        System.out.println("Buku Lawas : " + bukuLawas);
        System.out.println("Buku Baru : " + bukuBaru);
    }
}
