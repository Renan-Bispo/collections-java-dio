package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itens;

    public ShoppingCart() {
        this.itens = new ArrayList<>();
    }

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
            }
            itens.removeAll(itensToRemove);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public double calculateTotalValue(){
        double totalValue = 0.0;

        if (!itens.isEmpty()){
            for (Item item : itens) {
                double itemValue = item.getPrice() * item.getAmount();
                totalValue += itemValue;
            }
            return totalValue;
        } else {
            throw new RuntimeException("0,00");
        }
    }

    public void displayItem() {
        if (!itens.isEmpty()) {
            System.out.println(this.itens);

        } else {
            System.out.println("Sua lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "itens=" + itens +
                '}';
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("celular", 1000.0, 2);
        cart.addItem("notebook", 3000.0, 1);
        cart.addItem("tv", 5000.0, 1);

        cart.displayItem();

        cart.removeItem("celular");
        cart.removeItem("notebook");
        cart.removeItem("tv");
        cart.displayItem();

        cart.calculateTotalValue();
        System.out.println(cart.calculateTotalValue());
    }
}
