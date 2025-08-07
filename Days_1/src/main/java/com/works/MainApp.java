package com.works;

public class MainApp {

    public static void main(String[] args) {

        // Değişkenler

        // String - Karakter katarı
        String name = "Ali";
        String surname = "Bilmem";
        String city = "İstanbul";

        // int - tam sayı
        int age = 25;
        int year = 2025;
        int a = 555;
        int b = 144;
        int sum = a + b;
        System.out.println("Sum :" + sum);

        // double - ondalık
        double d1 = 10.5;
        double d2 = 44.7;
        double doubleSum = d1 + d2;
        System.out.println("Double Sum :" + doubleSum);

        // boolean - true, false
        boolean statusx = true;

        // operatörler
        // ++, --
        int x = 0;
        x = x + 1;
        x += 1;
        x++;
        System.out.println("x :" + x);

        int y = 10;
        y--;
        System.out.println("y :" + y);

        // logic operatörler - mantıksal
        // ==, !=, >, <, >=, <=,
        boolean status = true;
        String username = "ali";
        String password = "123456";

        status = username == "ali";
        System.out.println("username : " + status);
        status = password == "12345";
        System.out.println("password : " + status);

        int q = 10;
        int w = 11;
        status = w > q;
        System.out.println("w > q :" + status);
        status = q < w;
        System.out.println("q < w :" + status);
        status = q >= w;
        System.out.println("q >= w :" + status);
        status = q <= w;
        System.out.println("q <= w :" + status);

        // logic - &&, ||
        status = username == "ali" && password == "12345";
        System.out.println("Login : " + status);
        status = q > 9 || q > w;
        System.out.println("q > 9 or q > w :" + status);

        // if - karar kontrol
        if( q > 11 ) {
            // koşul sağlandığında yapılacak işlemler
            System.out.println("Koşul sağlandı");
        }else {
            System.out.println("Koşul sağlanmadı!");
        }

        // switch
        String day = "Perşemb";
        switch (day) {
            case "Pazartesi" -> System.out.println("Pazartesi");
            case "Salı" -> System.out.println("Salı");
            case "Çarşamba" -> System.out.println("Çarşamba");
            case "Perşembe" -> System.out.println("Perşembe");
            default -> {
                System.out.println("Gün hatalı!");
            }
        }


    }

}
