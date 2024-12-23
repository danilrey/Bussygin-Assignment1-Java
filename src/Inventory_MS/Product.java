package Inventory_MS;


public class Product {
    private static int ID = 0;
    public Product(String name) {
        this.name = name;
        ++ID;
        System.out.println("Product " + name + " created with ID: " + ID);
        if (quantity > 1) {
            System.out.println("Quantity of product: " + quantity);
        }
    }
    private final int ProductID = ID+1;
    private final String name;
    private double price;
    private int quantity = 1;
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Price of product: " + price);
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
        System.out.println("Quantity of product: " + quantity);
    }
    public void getInfo() {
        System.out.println("Product ID: " + ProductID + "\nProduct name: " + name + "\nProduct price: " + price + "\nProduct quantity: " + quantity);
    }
    public void sellProduct() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Product " + name + " sold, quantity left: " + quantity);
        } else {
            System.out.println("Product " + name + " is out of stock");
        }
    }
    public void buyProduct() {
        quantity++;
        System.out.println("Product " + name + " bought, quantity left: " + quantity);
    }
    public void deleteProduct() {
        System.out.println("Product " + name + " deleted");
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getProductID() {
        return ProductID;
    }
    public String getName() {
        return name;
    }
}
