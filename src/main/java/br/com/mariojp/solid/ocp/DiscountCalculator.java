package br.com.mariojp.solid.ocp;

public class DiscountCalculator {

    private DiscountPolicy policy;

    public DiscountCalculator(DiscountPolicy policy) {
        this.policy = policy;
    }


    public double apply(double amount, CustomerType type){
       return policy.apply(amount);
    }
}
