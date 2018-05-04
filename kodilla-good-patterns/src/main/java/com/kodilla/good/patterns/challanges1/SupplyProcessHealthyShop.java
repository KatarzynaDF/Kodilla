package com.kodilla.good.patterns.challanges1;

import java.util.HashMap;

public class SupplyProcessHealthyShop implements Supplier {

    private SupplierData supplierData;
    private String warehouseID;

    public SupplyProcessHealthyShop(SupplierData supplierData, String warehouseID) {
        this.supplierData = supplierData;
        this.warehouseID = warehouseID;
    }

    public SupplierData getSupplierData() {
        return supplierData;
    }

    public String getWarehouseID() {
        return warehouseID;
    }

    public HashMap<SupplierData, String> process(SupplierData supplierData) {

        HashMap<SupplierData, String> order = new HashMap<>();
        {
            order.put(new SupplierData(supplierData.getOrderNumber(), supplierData.getSupplierName(), supplierData.getProductName(), supplierData.getProductQuantity()), getWarehouseID());
            return order;
        }
    }
}