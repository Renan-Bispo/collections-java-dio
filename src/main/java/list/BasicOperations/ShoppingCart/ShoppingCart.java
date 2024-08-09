package list.BasicOperations.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itens;


    public void addItem(String name, double price, int amount) {
        Item item = new Item(name, price, amount);
        this.itens.add(item);
    }

    public void removeItem(String name) {
        List<Item> itensToRemove = new ArrayList<>();
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getName().equalsIgnoreCase(name)) {
                    itensToRemove.add(i);
                }
                itens.removeAll(itensToRemove);
            }
        } else System.out.println("A lista está vazia");

    }

}