public class PPBO_03_Latihan3 {

    public static void main(String[] args) {

        /*
         * int arr[] = { 5, 1, 4, 2, 3 };
         * for (int i = 1; i < 6; i++) {
         * System.out.println("elemen ke-" + i + " = " + arr[i]);
         * }
         */

        int arr[] = { 5, 1, 4, 2, 3 };
        for (int i = 0; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }

    }

}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang
// berupa bilangan integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan
// dengan for pada code tersebut sudah tepat dan tuliskan perbaikan apabila
// diperlukan!

// Jawab:
// Source code tersebut sudah benar, akan tetapi dalam pemanggilannya
// yang salah yang mana for pada code tersebut dimulai dari 1, sedangkan index
// array dimulai dari 0, sehingga index ke-0 pada array tersebut tidak tepanggil
// (tidak tercetak). Seharusnya for pada code tersebut dari 0, sehingga array
// index ke-0 pada array tersebut tepanggil (tercetak).
