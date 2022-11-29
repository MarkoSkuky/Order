package UML;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Order> orders = new ArrayList<>();

    public Shop() {
    }

    private int getIndexOrder(int id) {
        for (int i = 0; i <= orders.size(); i++) {
            if (id == orders.get(i).getIdOrder()) {
                return i;
            }
        }
        return -1;
    }


    public Order getOrder(int id) {
        int i = getIndexOrder(id);
        if (i < 0) {
            return null;
        }
        return orders.get(i);
    }

    public ArrayList<Order> getUnsolvedOrders() {
        ArrayList<Order> unsolvedOrders = new ArrayList<>();
        for (int i = 0; i <= orders.size(); i++) {
            if (!orders.get(i).isSolved()) {
                unsolvedOrders.add(orders.get(i));
            }
        }
        return unsolvedOrders;
    }

    public Order deleteOrder(int id) {
        int i = getIndexOrder(id);
        if (i < 0) {
            return null;
        }
        return orders.remove(i);
    }

    //prida objednavku ak taka este neexistuje
    public boolean addOrder(Order order) {
        for (int i = 0; i <= orders.size(); i++) {
            if (orders.get(i).getIdOrder() == order.getIdOrder()) {
                return false;
            }
        }
        orders.add(order);
        return true;
    }
}
