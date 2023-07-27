import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class task3 {
    public static void main(String[] args) {
        //Создать список типа ArrayList. Поместить в него как строки, так и целые числа.
        //Пройти по списку, найти и удалить целые числа.
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(3, "dog", 4, 5, "cat", 9, "mouse", 7));
//        for (int i = 0; i < list.size(); i++) {      //(int i = list.size()-1; i >= 0; i--)
//            if (list.get(i) instanceof Integer) {
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(list);
        Iterator<Object> lis = list.iterator();
        while (lis.hasNext()) {
            if (lis.next() instanceof Integer) {
                lis.remove();
            }
        }
        System.out.println(list);
    }
}