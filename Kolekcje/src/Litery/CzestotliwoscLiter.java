package Litery;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CzestotliwoscLiter {
    public CzestotliwoscLiter(javax.swing.JTextArea ta) throws FileNotFoundException,IOException{
        int kznak;
        char znak;
        String s = ta.getText();
        ta.getText();
        TreeMap<Character, Integer> licz = new TreeMap();
        
        for (int i = 0; i< s.length();i++){
            znak = s.charAt(i);
            if(licz.containsKey(znak)){
                licz.put(znak, licz.get(znak)+1);
            }
            else{
                licz.put(znak, 1);
            }
        }
        
        String ilosc = "";
        int wys = 0;
        for(Map.Entry<Character, Integer> w : licz.entrySet()){
            if(wys % 6 == 0)
                ilosc = ilosc +"\n";
            Character c = w.getKey();
            Integer i = w.getValue();
            if(c != '\n' && c !=' ' && c != '\t'){
                ilosc = ilosc + c + " = " + i +", ";
            }
            wys++;
        }
        if(ilosc.length() >= 2) ilosc = ilosc.substring(0,ilosc.length()-2);
        Litery.jTextArea2.setText(ilosc);
    }
}
