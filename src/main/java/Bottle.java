public class Bottle extends Product{

    private Double volume;

    public Bottle(String productName, Double productPrice, Double volume) {
        super(productName, productPrice);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + super.getProductName() + '\'' +
                ", productPrice=" + super.getProductPrice() + '\'' +
                ", productVolume=" + this.volume +
                '}';
    }
}
