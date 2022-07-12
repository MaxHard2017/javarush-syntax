package level5.task0502;
/*
Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот, у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.
Требования:

    •
    Класс Cat должен содержать конструктор без параметров.
    •
    Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
    •
    В классе Cat должен быть метод fight.
    •
    В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
    •
    Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
    •
    Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Cat
{
    public int age;
    public int weight;
    public int strength;

    public Cat ()
    {

    }
    public boolean fight(Cat fCat)
    {
        int vin = 0;
        if (this.age - fCat.age > 0) vin++;
        else if (this.age - fCat.age < 0) vin--;
        
        if (this.weight - fCat.weight > 0) vin ++;
        else if (this.weight - fCat.weight < 0) vin--;
        
        if (this.strength - fCat.strength > 0)vin ++;
        else if (this.strength - fCat.strength < 0) vin--;
        
        if(vin > 0) return true;
        else return false;
    }  



    public static void main(String[] args)
    {
        
    }
}
