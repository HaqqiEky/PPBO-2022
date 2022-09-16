import java.text.Format;

// Nama : Haqqi Setiadjie
// NIM  : M0521028

public class PPBO_02_Latihan3 {

    String nim, nama, alamat;
    char jenisKelamin;

    PPBO_02_Latihan3(String nim, String nama, char jenisKelamin, String alamat){

        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;

    }

    public static void main(String[] args) {
        PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L', "Bikini Bottom");

        System.out.printf("%-20s: %s\n", "Nama", mhs.nama);
        System.out.printf("%-20s: %s\n", "NIM", mhs.nim);
        System.out.printf("%-20s: %c\n", "Jenis Kelamin", mhs.jenisKelamin);
        System.out.printf("%-20s: %s\n", "Alamat", mhs.alamat);
    }
}
