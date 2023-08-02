public class Product {

    public String name;
    public double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Nome: " + name + ", " +  "Preço: " + price;
    }
}
