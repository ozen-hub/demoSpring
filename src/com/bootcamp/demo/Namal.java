package com.bootcamp.demo;

public class Namal implements Mahinda{
    private IMFService imfService;

    @Override
    public String steal(){
        return "Namal Steal (50000USD)";
    }

    @Override
    public String planningLoan() {
        // can't ==>
        return imfService.askingMoney();
    }
}
