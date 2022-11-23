public class HotDrink extends Bottle{
    private int temperature;

    public HotDrink(String productName, Double productPrice, Double volume, int temperature) {
        super(productName, productPrice, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "productName ='" + super.getProductName() + "\'" +
                ", productPrice ='" + super.getProductPrice() + "\'" +
                ", volume = '" + super.getVolume() + '\'' +
                ", temperature = '" + this.getTemperature() + '\'' +
                '}';
    }
}
