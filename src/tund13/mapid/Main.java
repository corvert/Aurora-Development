package tund13.mapid;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Map on andmekogum. Mapis on võti ja võtmele vastav väärtus (Key ja Value)
        //Key ja Value võib olla suvaline objekt

        Map<String, String> languages = new HashMap<>();

        //kui listi puhul on .add(), millega saab lisada
        //siis mapi puhul on .put()

        languages.put("Java", "Keel mida õpime");
        languages.put("Python", "Teine prog. keel");
        languages.put("C#", "Kolmas prog. keel");
        languages.put("BASIC", "Neljas prog. keel");

        //containsKey
        if(languages.containsKey("Java")){
            System.out.println("Java on juba olemas");
        }else {
            languages.put("Java", "123");
            System.out.println("Java edukalt lisatud");
        }

        System.out.println(languages);

        //.get()
//        System.out.println(languages.get("Java"));
//        System.out.println(languages.put("Java", "Esimene prog. keel"));
//        System.out.println(languages.get("Java"));

        //remove
//        System.out.println(languages.remove("Python"));
//        System.out.println(languages.get("Python"));
//        System.out.println(languages);

        //replace
        System.out.println(languages.replace("Python", "Snake"));
        System.out.println(languages.get("Python"));

        System.out.println(languages.replace("Dog", "Midagi ei juhtu"));
        System.out.println(languages.get("Dog"));

        System.out.println(languages.replace("Python", "Snake", "Madu"));
        System.out.println(languages.get("Python"));


        //key.Set() - võtmete kogum
        for (String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

        System.out.println(languages.values());
        System.out.println(languages.containsValue("Madu"));
        System.out.println(languages.putIfAbsent("Dog", "456"));
        System.out.println(languages.get("Dog"));

        //prim. tüüpide puhul (int, double, char jne) peab kasutama wrapper klasse
        Map<Integer, Character> myMap = new HashMap<>();
        //Map<int, char> myOtherMap = new HashMap<>();  // ei tööta

    }

}
