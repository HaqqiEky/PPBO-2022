import java.util.Scanner;

//Nama  : Haqqi Setiadjie
//NIM   : M0521028


public class PPBO_05_Latihan1 {
    public static void main(String args[] ) throws Exception {
       
        String s;
        int x;
        
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        input.close();
        
        for(x = 0; x < s.length(); x += 3){
            System.out.print(s.charAt(x));
        }
    }
}
