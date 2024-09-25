package product;
import java.util.Scanner;
public class Tester {
    //Buat object dari class CD
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
        
        System.out.println("Berapa jumlah object yang ingin kamu buat");
        int jumlah =in.nextInt();
        // condition dilengkapi > 10 atau <1 tdk dijalankan
        if(jumlah < 1 || jumlah > 10 ){
            System.out.println("Input Tidak Terdaftar");
        }
        for (int i = 1; i <=jumlah; i++) {
            
            try {
                System.out.println("Silahkan pilih 1 untuk membuat CD atau 2 untuk membuat DVD");
                int pilihan = in.nextInt();
                if (pilihan == 1) {
                CD c1 = new CD();
    
            c1.setArtist("lady gaga");
            c1.setLabel("Sony Music");
            c1.setNumsong(10);
            c1.setNama("Reborn");
            c1.setPrice(2000.0);
            c1.setNumber(2);
            c1.setQuantity(12);
    
            c1.print();
            } else if (pilihan == 2) {
                DVD d1 = new DVD();
    
            d1.setLength(300);
            d1.setRating("PG");
            d1.setStudio("Newline Cinema");
    
            d1.print();
            } else {
                System.out.println("Pilihan salah");
            }
            } catch (Exception e) {
                System.out.println("Tipe Data Salah, hanya menerima angka");
            }
            // mencegah error karena tipe data tidak sesuai
            
            in.close();
        }
        
        
    }
}
