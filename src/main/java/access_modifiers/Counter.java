package access_modifiers;

public class Counter {
    static int count = 0; // общее поле для всех объектов

    static {
        System.out.println("Класс загружен!");
    }

    Counter() {
        count++; // увеличивается при создании нового объекта
    }
}
