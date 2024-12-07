package org.example;
import java.util.*;

public class HumanMain {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Иван", "Иванов", 25));
        humans.add(new Human("Анна", "Петрова", 30));
        humans.add(new Human("Алексей", "Смирнов", 22));
        humans.add(new Human("Елена", "Дмитриева", 35));

        // a) Содержимое списка в HashSet.
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("HashSet:");
        for (Human human : hashSet) {
            System.out.println(human);
        }

        // b) Содержимое списка в LinkedHashSet.
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\nLinkedHashSet:");
        for (Human human : linkedHashSet) {
            System.out.println(human);
        }

        // c) Содержимое списка в TreeSet (сортировка - по возрасту)
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\nTreeSet (по возрасту):");
        for (Human human : treeSet) {
            System.out.println(human);
        }

        // d) TreeSet с компаратором HumanComparatorByLastName.
        TreeSet<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("\nTreeSet с компаратором по фамилии:");
        for (Human human : treeSetByLastName) {
            System.out.println(human);
        }

        // e) TreeSet с анонимным компаратором по возрасту
        TreeSet<Human> treeSetByAge = new TreeSet<>(Comparator.comparingInt(Human::getAge));
        treeSetByAge.addAll(humans);
        System.out.println("\nTreeSet с анонимным компаратором по возрасту:");
        for (Human human : treeSetByAge) {
            System.out.println(human);
        }

        // f) Почему выводы разных сетов различаются?
        /*
         *
         * Различия обусловлены тем, как каждая коллекция хранит и сортирует свои элементы:
         * - HashSet не сортирует элементы, а просто хранит их без порядка.
         * - LinkedHashSet сохраняет порядок добавления, что важно для тех случаев, когда порядок имеет значение.
         * - TreeSet автоматически сортирует элементы, либо по умолчанию, либо с помощью заданного компаратора.
         */
    }
}
