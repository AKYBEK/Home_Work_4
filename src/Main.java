import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
    }private static void differaneceLicnkToArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }
        Long startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);

        }
        Long endTime = System.currentTimeMillis();

    }
    private static void B() {
        Map<String , Integer> mapperStringToInteger = new HashMap<>();

        mapperStringToInteger.put ("A",1);
        mapperStringToInteger.put ("B",5);
        mapperStringToInteger.put ("A",2);
        mapperStringToInteger.put ("B",4);
        mapperStringToInteger.put ("A",3);
        mapperStringToInteger.put ("B",3);
        mapperStringToInteger.put ("A",4);
        mapperStringToInteger.put ("B",3);
        mapperStringToInteger.put ("A",5);
        mapperStringToInteger.put ("B",5);



    }
    private static void A() {
        Map<String , Integer> mapperStringToInteger = new HashMap<>();
        Iterator <String , Integer> iterator = linkedList.iterator();



            }
        }
    private static void C() {
        Map<String , Integer> mapperStringToInteger = new HashMap<>();

        mapperStringToInteger.put ("A",1);
        mapperStringToInteger.put ("B",5);
        mapperStringToInteger.put ("A",2);
        mapperStringToInteger.put ("B",4);
        mapperStringToInteger.put ("A",3);
        mapperStringToInteger.put ("B",3);
        mapperStringToInteger.put ("A",4);
        mapperStringToInteger.put ("B",3);
        mapperStringToInteger.put ("A",5);
        mapperStringToInteger.put ("B",5);


        System.out.println(mapperStringToInteger);
}