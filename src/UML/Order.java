package UML;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

public class Order {
    private int idOrder;
    private Customer customer;
    private ArrayList<Product> products = new ArrayList<>();
    private boolean solved = false;

    public Order(int idOrder, Customer customer) {
        this.customer = customer;
        this.idOrder = idOrder;


    }

    public int getIdOrder() {
        return idOrder;
    }

    public Customer getCustomer() {
        return customer;
    }


    public boolean isSolved() {
        return solved;
    }

    public void pridajProdukt(Product product) {
        this.products.add(product);
    }
}
