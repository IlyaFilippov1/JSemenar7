public class Snack extends Product{
    private String taste;
    public Snack(String productName, Double productPrice) {
        super(productName, productPrice);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
