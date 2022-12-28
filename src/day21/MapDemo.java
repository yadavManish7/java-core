package day21;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String> userMap = new HashMap<>();
        userMap.put("name","Manish");
        userMap.put("age","16");
        userMap.put("roll","10");

        System.out.println(userMap);
    }

}
