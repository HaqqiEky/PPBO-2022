import java.util.Scanner;

// Nama : Haqqi Setiadjie
// NIM  : M0421028

public class PPBO_04_Latihan1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }

}

/* 
a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! 
JAWAB :

 = Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
----> Tidak, program terhenti ketika user memasukan f

 - Tulis output yang muncul!
----> Output yang muncul berisi:
      Exception in thread "main" java.util.InputMismatchException
         at java.base/java.util.Scanner.throwFor(Scanner.java:939)
         at java.base/java.util.Scanner.next(Scanner.java:1594)
         at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
         at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
         at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:8)

 - Jelaskan maksud dari output tersebut!
 ----> Maksud dari output tersebut adalah terjadi output mismatch (ketidakcocokan) dikarenakan input yang
       yang dimasukan oleh user berbeda dengan tipe data yang dideklarasikan
      

 b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut!

JAWAB :
 = Tulis output yang muncul!
----> Output yang muncul berupa 5 / 0 = Infinity

 - Jelaskan maksud dari output tersebut!
====> karena tipe data pada hasil pembagian adalah double maka memungkinkan terjadinya pembagaian dengan penyebut
      bernilai 0 yang nantinya program akan mencetak Infinity. berbeda dengan ketika mendeklarasikan tipe data 
      integer di hasil pembagian, maka program akan menyatakan eror division by zero



*/
