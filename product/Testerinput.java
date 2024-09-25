package product;


import java.util.Scanner;
public class Testerinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("CD/DVD?");
        String pilihan = in.nextLine();

        System.out.println("Nama :");
        String Nama = in.nextLine();
        System.out.println("Number :");
        int Number = in.nextInt();
        System.out.println("quantity :");
        int quantity = in.nextInt();
        System.out.println("price :");
        double price = in.nextDouble();

        if(pilihan.equalsIgnoreCase("CD")){
            System.out.println("Artist :");
            String artist = in.nextLine();
            System.out.println("label :");
            String label = in.nextLine();
            System.out.println("Total song :");
            int numsong = in.nextInt();
            CD c1 = new CD(Number, Nama, quantity, price, artist, numsong, label);
            c1.print();
        } else if (pilihan.equalsIgnoreCase("DVD")) {

    }
    in.close();
}
}
