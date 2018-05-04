package com.kodilla.good.patterns.challanges1;

public class SupplierData {

    private int orderNumber;
    private String supplierName;
    private String productName;
    private int productQuantity;

    public SupplierData(int orderNumber, String supplierName, String productName, int productQuantity) {
        this.orderNumber = orderNumber;
        this.supplierName = supplierName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "Your data will be added to the order:" + " "+
              "orderNumber=" + orderNumber +
               ", supplierName='" + supplierName + '\'' +
               ", productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
