import java.util.ArrayList;

// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
public class Ex2 {
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
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
