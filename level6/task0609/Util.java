package level6.task0609;

public class Util {
    public static double getDistance( int x1, int y1, int x2, int y2) {
        return Math.sqrt( Math.pow((Math.abs(x1-x2)), 2) + Math.pow((Math.abs(y1-y2)), 2));
/*        берем разность координат по X и по Y по абсолютному значению чтобы не было 
        отрицательных занчений, и берем корень квадратный из суммы их квадратов
        по свойству прямоугольного трекгольника
*/
    }


    public static void main(String[] args) {
        
    }
}
