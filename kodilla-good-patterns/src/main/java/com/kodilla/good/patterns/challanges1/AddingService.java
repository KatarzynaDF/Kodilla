package com.kodilla.good.patterns.challanges1;

public class AddingService {

        private SupplierData supplierData;
        private  boolean b;
        public boolean isB() {
            return b;
        }

    public AddingService(SupplierData supplierData, boolean b) {
        this.supplierData = supplierData;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Order was added"+
                ", b=" + b +
                '}';
    }
}