import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметичское этого списка.
public class Ex3 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <Integer>();
        list.add(2);
        list.add(-3);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(23);
        list.add(-93);
        list.add(0);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(getAverage(list));
    }
    private static double getAverage(ArrayList<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }
}
