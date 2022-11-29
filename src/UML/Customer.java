package UML;

public class Customer {
    private int idCustomer;
    private String name;
    private String lastName;
    private String email;

    public Customer(int idCustomer, String name, String lastName, String email) {
        this.email = email;
        this.idCustomer = idCustomer;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
