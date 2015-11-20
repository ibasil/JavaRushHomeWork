package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man = new Man("Aaa", "aaa", 12);
        Man man1 = new Man("Bbb", "baba", 1);
        Woman w = new Woman("Aaa", "aaa", 12);
        Woman woman = new Woman("Aaa", "aaa", 12);

        //выведи их на экран тут
        System.out.println(man);
        System.out.println(man1);
        System.out.println(w);
        System.out.println(woman);
    }

    //добавьте тут ваши классы
    public static class Man {
        String name, address;
        int age;

        public Man(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString() {
            return "[" + name + " " + age + " " + address + "]";
        }
    }

    public static class Woman {
        String name, address;
        int age;

        public Woman(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString() {
            return "[" + name + " " + age + " " + address + "]";
        }
    }
}
