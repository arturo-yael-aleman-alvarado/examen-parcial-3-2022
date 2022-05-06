package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {
    private String code;
    private String providerCode;
    private int quantity;
    private BigDecimal unitCost;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderCode() {
        return providerCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public Item(String itemCode, String providerCode, BigDecimal unitCost, int quantity) {
        this.code = itemCode;
        this.providerCode = providerCode;
        this.unitCost = unitCost;
        this.quantity = quantity;
    }

    public Item() {

    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }
}
