package hashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Random;

public class Main {
    private static Random r = new Random();

    public static void main(String[] args) {
        ArrayList<String> map3 = new ArrayList<>();
        Collections.addAll(map3, "Vasya", "Sasha", "Artem", "Vasya", "Kolya", "Sasha", "Vasya", "Artem", "Sasha", "Sasha", "Vasya", "Kolya", "Artem", "Kolya", "Vasya", "Sasha");
        stringCounter(map3);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int number = r.nextInt(15);
            Collections.addAll(list1, number);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 6; i <= 10; i++) {
            int number = r.nextInt(15);
            Collections.addAll(list2, number);
        }

        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 11; i <= 15; i++) {
            int number = r.nextInt(15);
            Collections.addAll(list3, number);
        }

        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 16; i <= 20; i++) {
            int number = r.nextInt(15);
            Collections.addAll(list4, number);
        }

        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 21; i <= 25; i++) {
            int number = r.nextInt(15);
            Collections.addAll(list5, number);
        }
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        map.put("Vasya", list1);
        map.put("Tolya", list2);
        map.put("Artem", list3);
        map.put("Petya", list4);
        map.put("Sasha", list5);
        String winnerName = findWinner(map);
        System.out.println("______");
        for (String name : map.keySet()){
            System.out.println(name + " - " + map.get(name));
        }
        System.out.println(winnerName);
    }
    public static void stringCounter(ArrayList<String> arrayList) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (!(map.containsKey(arrayList.get(i)))) {
                map.put(arrayList.get(i), 1);
            } else {
                map.replace(arrayList.get(i), map.get(arrayList.get(i)) + 1);
            }
        }
        for (String text : map.keySet()){
            System.out.println(text + " - " + map.get(text));
        }
    }
    //ф-я приймає мапу - резудьтати змагань учасників. Знайти та повернути імя переможця, яке визначається максимальним
    //результатом, але якщо є декілька учасників з однаковим результатом - то переможцем є той, у кого сума баліп є найбільша
    public static String findWinner(HashMap<String, ArrayList<Integer>> map){
        int winnerResult = 0;
        String winnerName = "";
        int winnerSum = 0;

        for(String name : map.keySet()){
            int maxResult = 0;
            int sum = 0;
            ArrayList<Integer> listOfResults = map.get(name);
            for (int i = 0; i < listOfResults.size(); i++) {
                sum += listOfResults.get(i);
                if (maxResult < listOfResults.get(i)) maxResult = listOfResults.get(i);
            }
            if (maxResult > winnerResult){
                winnerResult = maxResult;
                winnerName = name;
                winnerSum = sum;
            }
            else if (maxResult == winnerResult && winnerSum < sum) {
                winnerSum = sum;
                winnerName = name;
            }
        }
        return winnerName;
    }
}
