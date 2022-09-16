
// Nama : Haqqi Setiadjie
// NIM  : M0521028

public class PPBO_02_Latihan2 {
    
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";

    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

// Apa yang salah dengan source code tersebut?
// Jawaban : Didalam fungsi main pada baris 12 terdapat perintah untuk mengganti/mengubah nilai dari variabel Kurs_Dollar
//           yang seharusnya tidak diganti, karena dalam deklarasi dari variabel KURS_DOLLAR terdapat keyword final yang 
//           menandakan bahwa variabel tersebut konstan dan tidak dapat diubah nilainya, sehingga perubahan dari variabel 
//           ini akan menyebabkan error.

// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : Keyword static merupakan keyword perintah khusus yang memungkinkan sebuah property atau method dapat diakses
//           langsung tanpa melalui object dengan cukup menulis nama class saja yang dipakai bersama-sama dalam setiap
//           objectnya meskipun beda nama dan variabel tersebut hanya di deklarasikan 1 kali saja