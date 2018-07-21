package com.kodilla.good.patterns.challanges1;

public class SupplyProcess {

    private SupplierData supplierData;

    public AddingService checkAdd (final AddingData addingData) {
        boolean isAdded = addingData.add(supplierData);

        if(isAdded) {

            return new AddingService(supplierData, true);
        } else {
            return new AddingService(supplierData, false);
        }
    }

}