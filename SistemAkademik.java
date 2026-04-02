import java.util.Scanner;

public class SistemAkademik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sksMaksimal = 0;
       

        System.out.println("Masukan nilai mu wahai anak muda");
       
       
        System.out.print("Masukkan Nilai IPS (0.00-4.00) \t: ");
        double ips = input.nextDouble(); 

        
        if (ips > 4.00) {
            System.out.println("Beban ajar : Tidak valid");
            sksMaksimal = 0;
        } 
        else if (ips < 0.00) {
            System.out.println("Beban ajar : Tidak Valid");
            sksMaksimal = 0;
        } 
        else if (ips >= 3.50) {
            sksMaksimal = 24;
            System.out.println("Beban ajar : " + sksMaksimal);
       
        } 
        else if (ips >= 3.00) {
            sksMaksimal = 22;
            System.out.println("Beban ajar : " + sksMaksimal);
            
        } 
        else if (ips >= 2.00) {
            sksMaksimal = 20;
            System.out.println("Beban ajar : " + sksMaksimal);
            
        } 
        else {
            sksMaksimal = 18;
            System.out.println("Beban ajar : " + sksMaksimal);
          
        }


        
        if (sksMaksimal == 0) {
            System.out.println("HAK SKS \t\t: DIBATALKAN (Hubungi Dosen Wali)");
        } else {
            System.out.println("HASIL SKS MAKSIMAL \t: " + sksMaksimal + " SKS");
        }
        System.out.println("==================================================");
        switch (sksMaksimal) {
            case 24:
                System.out.println("Predikat : Sangat Bagus");
                break;
            case 22:
                System.out.println("Predikat : Worth it banget");
                break;
            case 20:
                System.out.println("Predikat : Lumayan");
                break;
            case 18:
                System.out.println("Predikat : Gendeng");
        input.close();
       

        }
    }
}
