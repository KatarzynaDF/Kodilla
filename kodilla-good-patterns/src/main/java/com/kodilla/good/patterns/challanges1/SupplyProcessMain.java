package com.kodilla.good.patterns.challanges1;

public class SupplyProcessMain {
    public static void main(String[] args) {

      SupplierData supplierData1 = new SupplierData(1, "ExtraFoodShop", "apples", 340);
      SupplyProcessExtraFoodShop supplyProcessExtraFoodShop = new SupplyProcessExtraFoodShop(supplierData1, "Duty rate is: 10.5%");
      System.out.println(supplyProcessExtraFoodShop.process(supplierData1));
      SupplyProcess supplyProcess1 = new SupplyProcess();
      AddingData addingData1 = new AddingData(supplierData1);
      System.out.println(supplyProcess1.checkAdd(addingData1));

      SupplierData supplierData2 = new SupplierData(2, "HealthyFood", "bananas", 500);
      SupplyProcessHealthyShop supplyProcessHealthyShop = new SupplyProcessHealthyShop(supplierData2, "Warehouse ID: AB768F");
      System.out.println(supplyProcessHealthyShop.process(supplierData2));
      SupplyProcess supplyProcess2 = new SupplyProcess();
      AddingData addingData2 = new AddingData(supplierData2);
      System.out.println(supplyProcess2.checkAdd(addingData2));

      SupplierData supplierData3 = new SupplierData(3, "GlutenFreeShop","tomatoes", 500);
      SupplyProcessGlutenFreeShop supplyProcessGlutenFreeShop = new SupplyProcessGlutenFreeShop(supplierData3, "Special documents:needed");
      System.out.println( supplyProcessGlutenFreeShop.process(supplierData3));
      SupplyProcess supplyProcess3 = new SupplyProcess();
      AddingData addingData3 = new AddingData(supplierData3);
      System.out.println(supplyProcess3.checkAdd(addingData3));
    }
}
