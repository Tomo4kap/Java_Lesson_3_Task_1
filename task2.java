import java.util.ArrayList;
import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {
        //Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        //Вывести название каждой планеты и количество его повторений в списке.
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Mars", "Earth", "Mercury",
                "Earth", "Venera", "Mars", "Earth"));
        ArrayList<String> dublicate = new ArrayList<>();

        for (int i = 0; i < planets.size(); i++) {
            int count = 1;
            if (!dublicate.contains(planets.get(i))) {
                dublicate.add(planets.get(i));
                for (int j = i + 1; j < planets.size(); j++) {
                    if (planets.get(i).equals(planets.get(j))) {
                        count += 1;
                    }
                }
                System.out.println(planets.get(i) + " " + count);
            }
        }
    }
}