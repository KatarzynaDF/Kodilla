package com.kodilla.good.patterns.challanges1;

public class AddingData {

    private SupplierData supplierData;
    public AddingData(SupplierData supplierData) {
        this.supplierData = supplierData;
    }

    public SupplierData getSupplierData() {
        return supplierData;
    }

    public boolean add(SupplierData supplierData){
            return true;
        }
}
