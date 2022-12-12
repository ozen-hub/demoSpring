package com.bootcamp.demo;

public class Rohitha implements Mahinda{
    private IMFService imfService;

    public Rohitha(IMFService imfService) {
        this.imfService = imfService;
    }

    @Override
    public String steal(){
        return "Rohitha Steal (450000USD)";
    }

    @Override
    public String planningLoan() {
        // can't
        return imfService.askingMoney();
    }
}
