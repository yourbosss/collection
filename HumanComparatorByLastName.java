package org.example;
import java.util.*;

public class HumanComparatorByLastName implements Comparator<Human> {//реализует интерфейс Comparator<Human>.
    @Override
    public int compare(Human h1, Human h2) {
        return h1.getLastName().compareTo(h2.getLastName());
    }
}
//Отрицательное значение, если фамилия h1 идет до фамилии h2 в алфавите.
//Положительное значение, если фамилия h1 идет после фамилии h2.
//0, если фамилии одинаковы
