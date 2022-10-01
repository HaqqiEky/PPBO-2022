import java.util.Scanner;
import java.util.InputMismatchException;

// Nama : Haqqi Setiadjie
// NIM  : M0521028

public class PPBO_04_Latihan2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }

}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
// Jawab: 
/*
    Perbedaan pada source sebelumnya adalah terdapat Input Match Exeption menggunakan
    kode try{...} catch{...} dengan perulangan while, dimana program akan menangkap 
    Exception terlebih dahulu lalu mengulang kembali kode yang ada di dalam try {...},
    sehingga program tidak terhenti atau eror dikarenakan mismatch dengan menangani 
    Exeption tersebut. ketika user menginput huruf pada bilangan pertama, program akan 
    mencetak yang berasal dari kode catch{...} dan program akan terulang kembali dari awal.
*/
