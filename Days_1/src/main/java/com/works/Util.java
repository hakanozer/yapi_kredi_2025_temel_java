package com.works;

public class Util {

    int count = 100;

    public void noParams() {
        System.out.println( Action.name );
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
            arr[i] = addChar(arr[i]);
        }
        return arr;
    }

    private String addChar(String item) {
        item = " - " + item;
        return item;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int dataStringSum(String stNum1, String stNum2) {
        int n1 = Integer.parseInt(stNum1);
        int n2 = Integer.parseInt(stNum2);
        return n1+n2;
    }



}
