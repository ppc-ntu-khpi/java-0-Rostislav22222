
public class Shirt {

    public int shirtID = 5;
    public String description = "-Traditionally male-";
    public char colorCode = 'U';
    public double price = 100.0;
    public int quantityInStock = 35;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
}
