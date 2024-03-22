package Assignment1.Q4;

    class Laptop {
    private String model;
    private double price;

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Laptop model: " + this.model + ", price: " + this.price;
    }

}
public class Main{
    public static void main(String[] args) {
        // Create an instance of Laptop
        Laptop myLaptop = new Laptop();

        // Set the model using the setter method
        myLaptop.setModel("Dell XPS 15");

        myLaptop.setPrice(95000);

       

        // Print the laptop object using the toString() method
        System.out.println(myLaptop.toString());
    }
}
