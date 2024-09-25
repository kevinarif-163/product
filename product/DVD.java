package product;

public class DVD extends product {
    private int length;
    private String rating;
    private String Studio;

    public DVD(){
        super();
        this.length = 0;
        this.rating = "";
        this.Studio = "";
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.Studio;
    }

    public void setStudio(String Studio) {
        this.Studio = Studio;
    }

    public void print(){
        System.out.println("length\t:"+length);
        System.out.println("rating\t:"+rating);
        System.out.println("Studio\t:"+Studio);
    }

    
}
