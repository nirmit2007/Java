package Constructor;

public class Product
{
    private int id;
    private String name;
    private int quantity;
    private int price;
    private String brandName;

    // Default Constructor
    Product()
    {
        System.out.println("START --> Default Constructor");
        id = 0;
        name = "UNKNOWN";
        brandName = "No Brand";
        price = 0;
        quantity = 0;
        display();
        System.out.println("END --> Default Constructor");
    }

    // Parameterized Constructor
    Product(int id, String name, String brandName, int price, int quantity)
    {
        System.out.println("START --> Parameterized Constructor");
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.price = price;
        this.quantity = quantity;
        display();
        System.out.println("END --> Parameterized Constructor");
    }

    // Copy Constructor
    Product(Product p)
    {
        System.out.println("START --> Copy Constructor");
        this.id = p.id;
        this.name = p.name;
        this.brandName = p.brandName;
        this.price = p.price;
        this.quantity = p.quantity;
        display();
        System.out.println("END --> Copy Constructor");
    }

    // Display Method
    void display()
    {
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Brand Name : " + brandName);
        System.out.println("Price      : " + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", "HP", 65000, 5);
        Product p3 = new Product(p2);
        System.out.println("Displaying Objects:");
        p1.display();
        p2.display();
        p3.display();
    }
}
