package level8.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> iInputList = new ArrayList<Integer>(10);
        
        for (int i = 0; i < 13; i++) {
            iInputList.add(Integer.parseInt(read.readLine()));
        }

        ArrayList<ArrayList<Integer>> countNumbers = new ArrayList<ArrayList<Integer>>();
        
        for (int i = 0; i < iInputList.size(); i++) {
            int temp = iInputList.get(i);
            boolean addad = false;
            for (int j = 0; j < countNumbers.size(); j++) {
                if (countNumbers.get(j).get(0) == temp) {
                    countNumbers.get(j).add(temp);
                    addad = true;
                }
            }

            if (!addad) {
                ArrayList<Integer> tempAarray = new ArrayList<Integer>();
                tempAarray.add(temp);
                countNumbers.add(tempAarray);
                addad = true;
            }
        }

        int maxSize = 0;
        for (int i = 0; i < countNumbers.size(); i++) {
            if (countNumbers.get(i).size() > maxSize) maxSize = countNumbers.get(i).size();
        }
        System.out.println(maxSize);
    }
}