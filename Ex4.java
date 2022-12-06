// Даны два ArrayList из целых чисел. Написать функции, 
// которые вычисляют разницу коллекций: Разность: A - B = все числа из первой коллекции, 
// которые не содержатся во второй коллекции B - A = все числа из второй коллекции, 
// которые не содержатся в первой Симметрическая разность: A ^ B = числа из первой коллекции, 
// которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
 
public class Ex4 {
    public static void main(String[] args) {
        List<Integer> first = List.of(1, 3, 2, 3, 4, 1);
        List<Integer> second = List.of(1, 3, 5, 2, 4);
        List<String> a = new ArrayList<>(Arrays.asList("1", "3", "2", "3", "4","1"));
        List<String> b = new ArrayList<>(Arrays.asList("1", "3","5","2","4"));
 
        List<Integer> duplicates1 = findDifference1(first, second);
        System.out.println(duplicates1);

        List<Integer> duplicates2 = findDifference2(first, second);
        System.out.println(duplicates2);

        Collection<String> duplicates3 = symmetricDifference (a, b);
        System.out.println(Arrays.toString(duplicates3.toArray())); 
    }
    private static <T> List<T> findDifference1(List<T> first, List<T> second){
        List<T> diff = new ArrayList<>(first);
        diff.removeAll(second);
        return diff;
    }

    private static <T> List<T> findDifference2(List<T> first, List<T> second){
        List<T> diff = new ArrayList<>(second);
        diff.removeAll(first);
        return diff;
    }

    public static <T> Collection<T> symmetricDifference(Collection<T> a, Collection<T> b) {
        // Создаем новую коллекцию, чтобы не изменять исходные.
        Collection<T> intersection = new ArrayList<>(a);
        // Получаем пересечение коллекций.
        intersection.retainAll(b);
        Collection<T> result = new ArrayList<>(a);
        // Объединяем коллекции.
        result.addAll(b);
        // Удаляем элементы, расположенные в обоих коллекциях.
        result.removeAll(intersection);
        return result;
    }
}
