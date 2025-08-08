package com.works;

public class Person extends Customer{

    private int _tc;
    public Person(int tc) {
        this._tc = tc;
    }

    @Override
    public int tc() {
        return this._tc;
    }

}
