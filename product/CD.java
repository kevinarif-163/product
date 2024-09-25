package product;
//Inheritance (pewarisan)
public class CD extends product{
    private String artist;
    private int numSong;
    private String label;


    public CD () {
        super(); //constructor dari superclass
        artist = "";
        numSong = 0;
        label = "";
    }

    public CD(int Number, String Nama, int quantity, double  price, String artis, int Numsong, String label) {
        super(Number, Nama, quantity, price);
        this.artist = artist;
        this.numSong = numSong;
        this.label=label;

    }

    public String geNtArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumsong() {
        return this.numSong;
    }

    public void setNumsong(int numsong) {
        this.numSong = numsong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    //Override
    public void print() {
        super.print();
        System.out.println("Artist:\t" + artist);
        System.out.println("Total song:\t" + numSong);
        System.out.println("label\t:"+label);
    }

   

}
