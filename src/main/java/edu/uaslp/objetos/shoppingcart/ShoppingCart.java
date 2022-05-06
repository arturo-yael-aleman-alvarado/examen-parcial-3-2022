package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public BigDecimal getTotalCost() {
        if(items.isEmpty()){
            throw new EmptyShoppingCartException();
        }

        BigDecimal totalCost = BigDecimal.ZERO;

        for(Item item: items){
            totalCost = totalCost.add(item.getUnitCost().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        return totalCost;
    }

    public void addItem(Item item){

        if(item.getCode() == null){
            throw new InvalidDataException("Null or empty string not allowed for item code");
        }

        if(item.getProviderCode().isEmpty()){
            throw new InvalidDataException("Null or empty string not allowed for provider code");
        }

        if(item.getUnitCost().compareTo(BigDecimal.ZERO) < 0){
            throw new InvalidDataException("Cost must be greater than zero");
        }

        if(item.getQuantity() < 1 || item.getQuantity() > 5){
            throw new InvalidDataException("Quantity must be greater than zero and lower than 5");
        }

        for(Item existentItem: items){
            if (existentItem.getCode().equals(item.getCode()) && existentItem.getUnitCost().compareTo(item.getUnitCost()) == 0){
                existentItem.setQuantity(existentItem.getQuantity() + item.getQuantity());
                return;
            }
        }

        items.add(item);
    }

    public int getItemsCount() {
        int count = 0;

        for(Item item: items){
            count += item.getQuantity();
        }

        return count;
    }

    public List<Item> getItems() {
        return items;
    }

    public void removeItem(String itemCode) {
        for(Item item: items){
            if(item.getCode().equals(itemCode)){
                item.setQuantity(item.getQuantity() - 1);

                if(item.getQuantity() == 0){
                    items.remove(item);
                }
                return;
            }
        }
    }
}
