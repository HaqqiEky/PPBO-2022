package p8a;
import p8.Buku;

// Nama : Haqqi Setiadjie
// NIM  : M0521028

public class BukuInherit extends Buku{
    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {
        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
}

/*
Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier? Jelaskan penyebab errornya!
Jawab:
Terdapat 3 error yang ditemui yaitu sebagai berikut:
1. Error pada super.isbn karena attribute isbn pada file Buku.java dalam pakage com.java.p8 memiliki acces modofier default.
2. Error pada super.penulis karena attribute penulis pada file Buku.java dalam pakage com.java.p8 memiliki acces modofier private.
3. Error pada super.tahunTerbit karena attribute tahunTerbit pada file Buku.java dalam pakage com.java.p8 memiliki acces modofier default.
*/
