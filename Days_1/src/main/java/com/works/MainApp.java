package com.works;

import com.works.models.Human;
import com.works.useThread.Job;

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

        // tür dönüşümü
        String stAge = "30";
        int cAge = Integer.parseInt(stAge);
        System.out.println("cAge : " + (cAge + 5));

        String doValue = "33.7";
        double cValue = Double.parseDouble(doValue);
        System.out.println("cValue : " + cValue);

        // Array
        String[] users = {"Kemal", "Suna", "Zehra", "Ali", "Mehmet", "Ayşe"};
        // index - 0 dan başlar
        int index = 5;
        // arr size
        int size = users.length;
        System.out.println("size : " + size);
        System.out.println( users[0] );
        if (size > index) {
            System.out.println( users[index] );
        }else  {
            System.out.println( "index sınırların dışında: " + index );
        }
        System.out.println(users);

        // loop
        // for
        for(int i = 0; i<10; i++) {
            int xx = 0;
            System.out.println("i : " + i);
        }
        System.out.println("=========================");

        for (int i = 2; i < users.length; i++) {
            System.out.println("user : " + users[i]);
        }

        System.out.println("=========================");
        for(String item: users) {
            System.out.println("item : " + item);
        }

        // while
        System.out.println("=========================");
        int z = 0;
        while (z < users.length) {
            System.out.println("item : " + users[z]);
            z++;
        }

        // do - while
        System.out.println("=========================");
        int r = 0;
        do {
            System.out.println("Do While Call");
            r++;
        }while (r < 5);

        // nesne üretimi
        Util obj = new Util();
        System.out.println( obj.count );

        obj.noParams();
        obj.nameSurnameJoin("Erkan", "Bilmem");
        obj.nameSurnameJoin("Selin", "Bil");
        int charSize = obj.dataCharSize("Java Lang");
        System.out.println("charSize : " + charSize);
        if (charSize > 10) {
            System.out.println("10 karakterden büyük");
        }else {
            System.out.println("10 karakterden küçük");
        }

        System.out.println("=========================");
        String[] cities = {"İstanbul", "İzmir", "Ankara", "Aydın", "Bursa"};
        cities = obj.dataArr(cities);
        for(String item: cities) {
            System.out.println(item);
        }

        int sm = obj.sum(4564, 879);
        System.out.println("Sum : " + sm);

        int sm1 = obj.sum(656, 132);
        System.out.println("Sum1 : " + sm1);

        int stNum = obj.dataStringSum("100", "34534");
        System.out.println("stNum : " + stNum);

        System.out.println(Action.name);
        Action.name = "Serkan Bil";
        Action action = new Action();
        action.city = "İzmir";
        System.out.println( action.city );
        System.out.println( action.address );

        // Try - Catch
        int end = action.convert("101 ");
        System.out.println("end : " + end);
        // session

        User user = new User();
        Profile profile = new User();
        Security security = new Security();

        // Abstract class
        Person person = new Person(2);
        System.out.println( person.userName() );
        System.out.println( person.total() );

        //Properties
        Human h1 = new Human("Ahmet", "Yılmaz", "ahmet.yilmaz@mail.com", "pass123", 25);
        Human h2 = new Human("Ayşe", "Demir", "ayse.demir@mail.com", "pass123", 28);
        Human h3 = new Human("Mehmet", "Kaya", "mehmet.kaya@mail.com", "pass123", 32);
        Human h4 = new Human("Fatma", "Öztürk", "fatma.ozturk@mail.com", "pass123", 22);
        Human h5 = new Human("Emre", "Çelik", "emre.celik@mail.com", "pass123", 35);
        Human h6 = new Human("Zeynep", "Aydın", "zeynep.aydin@mail.com", "pass123", 29);
        Human h7 = new Human("Can", "Şahin", "can.sahin@mail.com", "pass123", 27);
        Human h8 = new Human("Elif", "Yıldırım", "elif.yildirim@mail.com", "pass123", 31);
        Human h9 = new Human("Burak", "Kurt", "burak.kurt@mail.com", "pass123", 26);
        Human h10 = new Human("Pınar", "Aslan", "pinar.aslan@mail.com", "pass123", 24);

        Human[] people = {h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};
        for( Human item: people ) {
            System.out.println(item.getEmail());
        }


        UseArrayList useArrayList = new UseArrayList();
        useArrayList.call();

        String[] images = {"1.jpg", "2.jpg", "3.jpg", "4.jpg"};
        for(String item: images) {
            Job job = new Job(item);
            job.start();
        }
        System.out.println("This line call");

    }

}
