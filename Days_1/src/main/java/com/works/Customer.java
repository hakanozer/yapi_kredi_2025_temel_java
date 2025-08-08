package com.works;

abstract public class Customer {

    abstract public int tc();

    public String userName() {
        int tc = tc();
        String name = "";
        switch (tc) {
            case 1 -> name = "Erkan Bil";
            case 2 -> name = "Serkan Bilsin";
            case 3 -> name = "Selin Bilirim";
        }
        return name;
    }

    public int total() {
        int tc = tc();
        int total = 0;
        switch (tc) {
            case 1 -> total = 1000000;
            case 2 -> total = 2000000;
            case 3 -> total = 3000000;
        }
        return total;
    }

}
