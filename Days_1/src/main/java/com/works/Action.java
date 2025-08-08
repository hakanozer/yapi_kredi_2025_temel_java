package com.works;

public class Action {

    // static
    // hiç bir zaman ölmez
    // nesne üretimi yapılmaksızın kullanıma uygundur
    public static String name = "Erkan Bilsin";
    String city = "İstanbul";
    final String address = "Kadıköy";


    // kurucu method
    // Sınıf adı ile aynı olacak
    // void - return anahtar kelimesi almazlar
    public Action() {
        call1();
        call1();
    }

    private void call1() {
        int a = 10;
        System.out.println("call1: " + a);
    }

    private void call2() {
        System.out.println("call1");
    }

    public int convert(String data) {
        try {
            // hata olma olasığı olan kodlar yazılır
            int convertData = Integer.parseInt(data);
            return convertData;
        }catch (Exception ex){
            // hata olduğunda çalışan kod parçası
            System.out.println("Lütfen sayısal değerler giriniz!");
        }
       return 0;
    }



}
