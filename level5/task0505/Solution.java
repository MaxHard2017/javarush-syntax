package level5.task0505;
/*
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран c новой строки.
Требования:

    Программа не должна считывать данные с клавиатуры.
    Нужно создать три объекта типа Cat.
    Нужно провести три боя.
    Программа должна вывести результат каждого боя с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat[] figthtCat = new Cat[3];
        for (int i = 0; i < 3; i++)
        {
            figthtCat[i] = new Cat("Vaska" + Integer.toString(i), (int)((Math.random()*100)/10), (int)((Math.random()*100)/10), (int)((Math.random()*100)/10));
           // System.out.println(figthtCat[i].name);
           // System.out.println(figthtCat[i].age);
           // System.out.println(figthtCat[i].weight);
           // System.out.println(figthtCat[i].strength);
           // System.out.println();
        }

        System.out.println(figthtCat[0].name + " vs " + figthtCat[1].name + " : " + figthtCat[0].fight(figthtCat[1]));
        System.out.println(figthtCat[0].name + " vs " + figthtCat[2].name + " : " + figthtCat[0].fight(figthtCat[2]));
        System.out.println(figthtCat[1].name + " vs " + figthtCat[2].name + " : " + figthtCat[1].fight(figthtCat[2]));
        
        


    
    }

    public static class Cat
    {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat)
        {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }

}
