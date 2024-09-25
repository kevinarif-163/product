package product;

public class product {
    private int number;
    private String nama;
    private int quantity;
    private double price;

    public product() {
        number = 0;
        nama = "";
        quantity = 0;
        price = 0.0;
    }

    public product(int number, String nama, int quantity, double price){
        
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void print(){
        System.out.println("number\t:"+ number);
        System.out.println("nama\t:"+nama);
        System.out.println("quantity\t:" +quantity);
        System.out.println("price\t:"+price);
    }
        
    
}
