import java.util.Scanner;;

// Nama : HAqqi Setiadjie
// NIM  : M0521028

public class PPBO_03_Latihan1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Total pembelian : ");
        int bill = sc.nextInt();

        double discount;

        if (bill < 50000)
        {
            discount = 0;

        }
        else if (bill <= 75000)
        {
            discount = Double.valueOf(bill) * 0.05;

        }
        else if (bill <= 125000)
        {
            discount = Double.valueOf(bill) * 0.15;
        }
        else
        {
            discount = Double.valueOf(bill) * 0.2;

        }

        System.out.println("\n=========================================\n");
        System.out.println("Total Pembayaran Anda Sebesar : "+ bill);

        if(discount != 0)
        {
            System.out.println("\n-----------------------------------------\n");
            System.out.println("Anda Mendapatkan Diskon sebesar : "+ ((discount/Double.valueOf(bill))*100) + "%");
            System.out.println("Pembayaran Anda Setelah Diskon : "+ (Double.valueOf(bill)-discount));

        }
        
        System.out.println("\n=========================================\n");

        // tambahkan code untuk menyimpan nominal total pembelian
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan

        sc.close();
    }

}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000
