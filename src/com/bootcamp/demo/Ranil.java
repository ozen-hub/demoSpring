package com.bootcamp.demo;

public class Ranil implements Mahinda{

    private IMFService imfService;

    public void setImfService(IMFService imfService) {
        this.imfService = imfService;
    }

    @Override
    public String steal() {
        return null;
    }

    @Override
    public String planningLoan() {
        return imfService.askingMoney() + "& i'm gonna steal it!";
    }
}
