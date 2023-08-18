package com.workintech.ArrayList.mobile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("1231231");
        Contact ahmet = new Contact("Ahmet", "1231231");
        phone.addNewContact(new Contact("Ayse", "5464665"));
        phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Cem", "1231232"));
        phone.addNewContact(new Contact("Ali", "1231232"));
        phone.addNewContact(new Contact("Cem", "1231233"));
       phone.printContact();

       System.out.println("Index: " + phone.findContact(ahmet));
       System.out.println("Index with String: " + phone.findContact(ahmet.getName()));
       System.out.println("Query Contact: " + phone.queryContact("Ayse"));
       phone.removeContact(ahmet);
       phone.printContact();

        //int x = 011;

        List<String> fruits = new LinkedList<>();
        fruits.add("Banana".toLowerCase());
        fruits.add("Apple".toLowerCase());
//        if(fruits.contains("BANANA".toLowerCase())){
//            System.out.println("TRUE");
//        }

       /* List<Person> people = new ArrayList<>();
        Person p1 = new Person(1, "Dogancan");
        Person p2 = new Person(1, "Dogancan");
        Person p3 = new Person(1, "Dogancan");
        people.add(p1);
        people.add(p2);

        if(people.contains(p1)){
            System.out.println
            "TRUE");
        } else{
            System.out.println("FALSE");
        }
    */
    }
}
