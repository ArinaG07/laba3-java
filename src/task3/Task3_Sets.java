package task3;

import java.util.*;

class HumanComparatorByLastName implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getLastName().compareTo(h2.getLastName());
    }
}

public class Task3_Sets {
    public static void run() {
        List<Human> humans = new ArrayList<>(Arrays.asList(
                new Human("Иван", "Иванов", 25),
                new Human("Петр", "Петров", 30),
                new Human("Анна", "Иванова", 22),
                new Human("Алексей", "Иванов", 40),
                new Human("Иван", "Иванов", 25)
        ));
        System.out.println("Исходный список: " + humans);

        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("\n2. HashSet (порядок случайный, без дубликатов):\n" + hashSet);

        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\n3. LinkedHashSet (сохраняет порядок добавления):\n" + linkedHashSet);

        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\n4. TreeSet (сортировка Фамилия->Имя->Возраст):\n" + treeSet);

        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("\n5. TreeSet (компаратор только по фамилии, люди с одинаковой фамилией отсекаются):\n" + treeSetByLastName);

        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(humans);
        System.out.println("\n6. TreeSet (анонимный компаратор по возрасту):\n" + treeSetByAge);

        System.out.println("\n7. Различия объяснены в комментариях и выводе выше (HashSet не упорядочен, LinkedHashSet хранит порядок вставки, TreeSet сортирует структуры).");
    }
}

