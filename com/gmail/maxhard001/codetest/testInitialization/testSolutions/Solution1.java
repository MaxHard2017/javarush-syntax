package com.gmail.maxhard001.codetest.testInitialization.testSolutions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ñëîâà ñ öèôðàìè

Â ìåòîä main ïåðâûì ïàðàìåòðîì ïðèõîäèò èìÿ ôàéëà1, âòîðûì - ôàéëà2.
Ôàéë1 ñîäåðæèò ñòðîêè ñî ñëîâàìè, ðàçäåëåííûìè ïðîáåëîì.
Çàïèñàòü ÷åðåç ïðîáåë â Ôàéë2 âñå ñëîâà, êîòîðûå ñîäåðæàò öèôðû, íàïðèìåð, à1, abc3d èëè 564.
Çàêðûòü ïîòîêè.


Requirements:
1. Ïðîãðàììà ÍÅ äîëæíà ñ÷èòûâàòü äàííûå ñ êîíñîëè.
2. Ïðîãðàììà äîëæíà ñ÷èòûâàòü ñîäåðæèìîå ïåðâîãî ôàéëà (èñïîëüçóé FileReader c êîíñòðóêòîðîì String).
3. Ïîòîê ÷òåíèÿ èç ôàéëà (FileReader) äîëæåí áûòü çàêðûò.
4. Ïðîãðàììà äîëæíà çàïèñûâàòü âî âòîðîé ôàéë âñå ñëîâà èç ïåðâîãî ôàéëà êîòîðûå ñîäåðæàò öèôðû (èñïîëüçóé FileWriter).
5. Ïîòîê çàïèñè â ôàéë (FileWriter) äîëæåí áûòü çàêðûò.
*/

public class Solution1 {
    public static void main(String[] args) throws IOException{
        List<String> list = new ArrayList<>();
        List<String> buffer = new ArrayList<>();

        try (
                BufferedReader in = new BufferedReader(new FileReader(args[0]));        
                FileWriter out1 = new FileWriter(args[1]);
                
        )
        {
            while (in.ready()){
                list.add(in.readLine());
            }
            for (int i = 0; i < list.size(); i++) {
                String[] str = list.get(i).split(" ");
                for (int j = 0; j < str.length; j++) {

                        boolean b = new Solution1().regEx("[0-9]",str[j]);
                        if (b == false) {
                            buffer.add(str[j] + " ");
                        }
                }
            }
            String text = String.join("",buffer).trim();
            out1.write(text);

        }
    }
    public boolean regEx(String str1,String str2){
        ArrayList<String> list = new ArrayList<>();
        Pattern regex = Pattern.compile(str1);
        Matcher m = regex.matcher(str2);
        while (m.find()){
            String s = m.group();
            list.add(s);
        }
        String res = String.join("",list);
        boolean bool ;
        if (res != ""){
            bool = false;
        }else bool = true;

        return bool;
    }

}