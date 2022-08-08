package level6.task0617;

public class Solution {
/* 
 * 1. В классе Solution создать public static класс Idea.
 * 2. В классе Idea создать метод public String getDescription(), который будет возвращать
 * любую строку.
 * 3. В классе Solution создай статический метод public void printIdea(Idea idea),
 *  который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().
 */

    public static void main(String[] args) {
        printIdea(new Idea("Cat"));
        printIdea(new Idea("Dog"));
    }

    public static class Idea {
        public String description = "";
        
        public Idea (String s) {
        this.setDescripion(s); 
        }
        public void setDescripion (String s) {
            this.description = s;
        }
        public String getDescription(){
            return this.description; 
        } 
    }
    
    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }


}
