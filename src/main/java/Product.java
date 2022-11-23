public class Product {
    String productName;
    Double productPrice;

    public Product(String productName, Double productPrice){
        this.productName = productName;
        this.productPrice = productPrice;

    }
    public String getProductName(){
        return this.productName;

    }
    public void setProductName(String productName){
        this.productName = productName;

    }

    public Double getProductPrice(){
        return this.productPrice;

    }
    public void setProductPrice(Double productPrice){
        this.productPrice = productPrice;

    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
