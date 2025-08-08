package com.works;

import com.works.models.Human;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UseArrayList {

    public void call() {

        ArrayList<String> list = new ArrayList();

        // List Add
        list.add("İstanbul");
        list.add("Ankara");
        list.add("Bursa");
        list.add("Adana");
        list.add("İzmir");
        list.add("Samsun");

        // get item
        System.out.println(list.get(0));

        // size
        System.out.println(list.size());

        // loop
        for (String item : list) {
            System.out.println(item);
        }

        // delete item
        //list.remove(0);
        //list.remove("Ankara");
        //list.clear();

        list.add(1, "Edirne");
        System.out.println(list);


        ArrayList<Human> humans = new ArrayList<>();

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

        humans.add(h1);
        humans.add(h2);
        humans.add(h3);
        humans.add(h4);
        humans.add(h5);
        humans.add(h6);
        humans.add(h7);
        humans.add(h8);
        humans.add(h9);
        humans.add(h10);

        for (Human human : humans) {
            System.out.println(human.getName() + " " + human.getSurname());
        }

        System.out.println(humans);

    }

}
