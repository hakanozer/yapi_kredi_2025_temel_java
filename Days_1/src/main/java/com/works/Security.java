package com.works;

public class Security extends User{

    public void boot() {
        System.out.println("Boot Call");
    }

    @Override
    public String userName() {
        return "Erdal Bilirim";
    }

}
