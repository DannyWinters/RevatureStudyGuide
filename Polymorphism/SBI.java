package Polymorphism;

import Polymorphism.Bank;

public class SBI extends Bank {
    public float interest = 8f;
    public float getRateOfInterest(){
        return interest;
    }
}
