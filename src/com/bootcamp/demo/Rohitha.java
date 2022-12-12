package com.bootcamp.demo;

public class Rohitha implements Mahinda{
    private IMFService imfService;
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
