package com.kodilla.good.patterns.challanges1;

import java.util.HashMap;

public class SupplyProcessGlutenFreeShop implements Supplier{

    private SupplierData supplierData;
    private String additionalDocuments;

    public SupplyProcessGlutenFreeShop(SupplierData supplierData, String additionalDocuments) {
        this.supplierData = supplierData;
        this.additionalDocuments = additionalDocuments;
    }

    public SupplierData getSupplierData() {
        return supplierData;
    }

    public String getAdditionalDocuments() {
        return additionalDocuments;
    }

    public HashMap<SupplierData, String> process(SupplierData supplierData) {

        HashMap<SupplierData, String> order = new HashMap<>();
        {
            order.put(new SupplierData(supplierData.getOrderNumber(), supplierData.getSupplierName(), supplierData.getProductName(),supplierData.getProductQuantity()),getAdditionalDocuments());
            return order;
        }
    }
}