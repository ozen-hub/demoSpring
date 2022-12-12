package com.bootcamp.demo;

public class Namal implements Mahinda{
    // constructor, ===> setter, interface, autowired
    private IMFService imfService;

    public Namal(IMFService imfService) {
        this.imfService = imfService;
    }


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
