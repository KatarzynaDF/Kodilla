package com.kodilla.good.patterns.challanges1;

import java.util.HashMap;

public interface Supplier {

    HashMap<SupplierData, String> process(SupplierData supplierData);

}
