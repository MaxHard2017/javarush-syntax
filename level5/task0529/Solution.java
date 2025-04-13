package level5.task0529;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static class IntAccum{

        private int numberAccum;

        int getNumberAccum(){
            return this.numberAccum;
        }
        void setNumberAccum(int inputNumber){
            this.numberAccum = inputNumber;
        }
            public IntAccum(){
            this.numberAccum = 0;
            System.out.println("Enter int numbers and I will calculate and keeps its summ");
        }
        @Override
        public String toString() {
            return Integer.toString(this.numberAccum);
        }

        public void inputNumber() throws IOException{                                     //метод читает инты с клавиатуры и сохраняет их сумму в переменной класса numberAccum
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in, "utf-8"));
            System.out.println("Enter the word \'сумма\'to stop reading keyboard ");
            System.out.println("Ints:");
            while (true){
                String inputString = read.readLine();
                if (inputString.equals("сумма")){
                    break;
                }
                this.setNumberAccum(this.getNumberAccum() + Integer.parseInt(inputString)); //читает инт и суммируем через геттер и сеттер не использую полей класса IntAccum
            }
                      
        }
         
        public void printSumm(){                                                            //выводит сумму интов введенных с клавиатуры
            System.out.println("I've read and accumulated integers from the keyblard");
            System.out.println(this.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        IntAccum accum = new IntAccum();
        accum.inputNumber();
        accum.printSumm();
    }
}
