package com.works;

public class Util {

    int count = 100;

    public void noParams() {
        System.out.println("noParams call");
    }

    public void nameSurnameJoin(String name, String surname) {
        String nameSurname = name + " - " + surname;
        System.out.println(nameSurname);
    }

    public int dataCharSize(String data) {
        int size = data.length();
        return size;
    }

    public String[] dataArr(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = " - " + arr[i];
        }
        return arr;
    }

}
