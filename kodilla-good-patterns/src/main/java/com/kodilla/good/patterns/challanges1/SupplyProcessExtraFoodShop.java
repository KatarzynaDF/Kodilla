package com.kodilla.good.patterns.challanges1;

import java.util.HashMap;

public class SupplyProcessExtraFoodShop implements Supplier {

        private SupplierData supplierData;
        private String dutyRangePercentage;

        public SupplyProcessExtraFoodShop(SupplierData supplierData, String dutyRangePercentage) {
            this.supplierData = supplierData;
            this.dutyRangePercentage = dutyRangePercentage;
        }

        public SupplierData getSupplierData() {
            return supplierData;
        }

        public String getDutyRangePercentage() {
            return dutyRangePercentage;
        }

        public HashMap<SupplierData, String> process(final SupplierData supplierData) {

            HashMap<SupplierData, String> order = new HashMap<>();
            {
                order.put(new SupplierData(supplierData.getOrderNumber(), supplierData.getSupplierName(), supplierData.getProductName(), supplierData.getProductQuantity()), getDutyRangePercentage());

            }
            return order;
        }
    }