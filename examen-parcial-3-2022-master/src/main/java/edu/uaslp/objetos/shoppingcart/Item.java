package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {
    private float code;
    private int quantity;

    public Item(String itemCode1, String providerCode1, BigDecimal bigDecimal, int i) {
    }

    public Item() {

    }

    public float getCode() {
        return code;
    }

    public void setCode(float code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProviderCode(String providerCode) {
    }

    public void setUnitCost(BigDecimal bigDecimal) {
    }

    public boolean getProviderCode() {
        return false;
    }

    public boolean getUnitCost() {
        return false;
    }
}
