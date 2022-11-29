package UML;

public class Product {

    private int idProduct;
    private String title;
    private String description;
    private ProductType type;

    public Product(int idProduct, String title, String description, ProductType type) {
        this.idProduct = idProduct;
        this.title = title;
        this.description = description;
        this.type = type;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
