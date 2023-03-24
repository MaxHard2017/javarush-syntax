package level3.lesson10;

public class TimeMachine
{
    public void goToFuture10 (Cat dog)
    {
        dog.name = "Ralf";
        dog.age += 10;
    }

    public void goToPast10 (Cat frog)
    {
        frog.name = "Kvaki";
        frog.age -= 10;
    }
    
 
    public static void main(String[] args) 
    {
        TimeMachine launchTimeMachine = new TimeMachine();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(3, "Murzik");
        System.out.println("Cоздали двух котов:");

        System.out.println ("Первыый кот :" + cat1.name + ", возраст: " + cat1.age);
        System.out.println ("Воторой кот :" + cat2.name + ", возраст: " + cat2.age);

        System.out.println("Запускаем первого в будущее, а второго в прошлое:");
        launchTimeMachine.goToFuture10 (cat1);
        launchTimeMachine.goToPast10 (cat2);

        System.out.println ("Первыый кот :" + cat1.name + ", возраст: " + cat1.age);
        System.out.println ("Воторой кот :" + cat2.name + ", возраст: " + cat2.age);
        
        System.out.println("теперь второго кота в будущее");
        launchTimeMachine.goToFuture10 (cat2);
        System.out.println ("Воторой кот :" + cat2.name + ", возраст: " + cat2.age);
        System.out.println("теперь второго кота в будущее еще раз");
        launchTimeMachine.goToFuture10 (cat2);       
        System.out.println ("Воторой кот :" + cat2.name + ", возраст: " + cat2.age);

        System.out.println("проверяем - первый кот :");
        System.out.println ("Первыый кот :" + cat1.name + ", возраст: " + cat1.age);
    }
}