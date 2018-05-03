package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public static void main(String[] args) {
        RentalService rentalService = new RentalService();
        InformationService informationService = new InformationService();
        RentalRepository rentalRepository = new RentalRepository();
        RentalProcessor rentalProcessor = new RentalProcessor(informationService, rentalService, rentalRepository);
        RentRequest rentRequest = new RentRequest("Kasia", "Gliwice", "Zabrze");

        System.out.println(rentalProcessor.process(rentRequest));

    }
}
