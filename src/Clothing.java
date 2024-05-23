public class Clothing extends Product {
    private int size;
    private String material;
    public Clothing(String name, String desc, double price, int size, String material) {
        super(name, desc, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return name + " " + description + " " + price + " EUR" +
                "Size: " + size + " Material: " + material;
    }
}
