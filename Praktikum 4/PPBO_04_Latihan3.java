import java.util.Scanner;
import java.util.InputMismatchException;

// Nama : Haqqi Setiadjie
// NIM  : M0521028

public class PPBO_04_Latihan3 {
    
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

                //tambahan kode untuk kondisi ketika bil2 = 0
                if (bil2 == 0){
                    throw new Exception("Dalam pembagian penyebut tidak boleh bernilai 0");
                }

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            } 

            // Tambahkan catch statement tambahan di sini
            catch (Exception e){

                System.out.println("Error : "+ e.getMessage());
            }
        }

        sc.close();
    }

}

// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!
