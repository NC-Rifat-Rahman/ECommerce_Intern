public class Products
{
    private int id;
    private static String name;
    private String description;
    private static String category;
    private static String brand;
    private static float price;
    private static int amounInstock;
    private static Availibility availibility;

    public Products(int id, String name, String description, String category, String brand, float price, int amounInstock, Availibility availibility) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.amounInstock = amounInstock;
        this.availibility = availibility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getAmounInstock() {
        return amounInstock;
    }

    public void setAmounInstock(int amounInstock) {
        this.amounInstock = amounInstock;
    }

    public static Availibility getAvailibility() {
        return availibility;
    }

    public void setAvailibility(Availibility availibility) {
        this.availibility = availibility;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", amounInstock=" + amounInstock +
                ", availibility=" + availibility +
                '}';
    }
}
