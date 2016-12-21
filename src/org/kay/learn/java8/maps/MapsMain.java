package org.kay.learn.java8.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kay on 21/12/16.
 */
public class MapsMain {
    public static void main(String args[]) {
        Map<String,String> superPowers = new HashMap<>();

        //Put if present
        superPowers.put("Goku","Spirit Bomb");
        System.out.println("Goku superpower : " + superPowers.get("Goku"));
        String power = superPowers.putIfAbsent("Goku","Kamehameha");
        System.out.println("Goku superpower (after put if absent) : " + power);
        superPowers.put("Goku","Dragon punch");
        System.out.println("Goku superpower  (after second put): " + superPowers.get("Goku"));
        superPowers.putIfAbsent("Krilin","Destruction Disk");
        System.out.println("Krilin superpower : " + superPowers.get("Goku"));
        //Compute if present
        superPowers.computeIfPresent("Goku",(k,v) -> k + " : " + v);
        System.out.println("Power:" + superPowers.get("Goku"));
        superPowers.computeIfPresent("Vegeta",(k,v) -> k + " : " + v);
        System.out.println("Power:" + superPowers.get("Vegeta"));

        //Remove
        superPowers.put("Goku","Dragon punch");
        superPowers.remove("Goku","Kamehameha");
        System.out.println("Goku superpower : " + superPowers.get("Goku"));
        superPowers.remove("Goku","Dragon punch");
        System.out.println("Goku superpower : " + superPowers.get("Goku"));
    }
}
