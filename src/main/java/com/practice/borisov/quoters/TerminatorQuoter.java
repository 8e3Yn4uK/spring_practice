package com.practice.borisov.quoters;

import javax.annotation.PostConstruct;

public class TerminatorQuoter implements Quoter {
    private String message;

    @InjectRandomInt(min = 2, max = 10)
    private int repeat;

    public void setMessage(String message) {
        this.message = message;
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
        System.out.println(repeat);
    }

    @PostConstruct
    public void init(){
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Message: " + message);
        }
    }
}
