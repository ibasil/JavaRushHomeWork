package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution() {}
    public Solution(byte a) {}
    public Solution(short a) {}

    protected Solution(int i) {}
    protected Solution(long l) {}
    protected Solution(double d) {}

    Solution(float f){}
    Solution(Byte b){}
    Solution(Short b){}

    private Solution(Integer i){}
    private Solution(Long l){}
    private Solution(Double d){}
}

