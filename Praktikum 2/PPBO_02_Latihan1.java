import java.text.DecimalFormat;

// Nama : Haqqi Setiadjie
// NIM  : M0521028

public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double aa = Double.valueOf(a);
        double cc = Double.valueOf(c);

        DecimalFormat df = new DecimalFormat("#.#");
        double abc = aa + b + cc;

        System.out.println(df.format(abc));
    }
}

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */
