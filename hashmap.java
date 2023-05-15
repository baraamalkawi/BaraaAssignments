import java.util.HashMap;
import java.util.Map;

public class hashmap {

public static void main(String[] args) {


        Map<String, Integer> Map = new HashMap<>();


        Map.put("Mohammed", 25);
        Map.put("Ahmad", 30);
        Map.put("Esra", 35);
        Map.put("Ruba", 40);


        int Mohammedage=
        Map.get("Mohammed");
        System.out.println(" Mohammed age: " +Mohammedage);




        for (String key : Map.keySet()) {
        int age = Map.get(key);
        System.out.println(key + ": " + age);
        }


        boolean isEmpty = Map.isEmpty();
        System.out.println("Is the HashMap empty? " + isEmpty);
        }
        }

