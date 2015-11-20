package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты
и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human gpa = new Human("Павел", true, 75, null, null);
        System.out.println(gpa);
        Human gpa1 = new Human("Коля", true, 65, null, null);
        System.out.println(gpa1);
        Human gma = new Human("Нина", false, 66, null, null);
        System.out.println(gma);
        Human gma1 = new Human("Оля", false, 75, null, null);
        System.out.println(gma1);

        Human father = new Human("Павел", true, 55, gpa1, gma1);
        System.out.println(father);
        Human mother = new Human("Лена", false, 45, gpa, gma);
        System.out.println(mother);

        Human ch1 = new Human("Аня", false, 21, father, mother);
        System.out.println(ch1);
        Human ch2 = new Human("Вася", true, 21, father, mother);
        System.out.println(ch2);
        Human ch3 = new Human("Галя", false, 21, father, mother);
        System.out.println(ch3);
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
