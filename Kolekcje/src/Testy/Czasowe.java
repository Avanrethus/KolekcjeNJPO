
package Testy;

import java.util.ArrayList;
import java.util.LinkedList;


public class Czasowe {
    public static void main(String [] args){
        ArrayList<Integer> al = new ArrayList();
        LinkedList<Integer> ll = new LinkedList();
        long czasPrzed;
        long czasPo;
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.add(0,1);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Dodawanie na początek - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.addFirst(1);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Dodawanie na początek - LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.add(50000,1);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Dodawanie do środka - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.add(50000,1);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Dodawanie do środka - LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
         czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.add(al.size()-1,1);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Dodawanie na koniec - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.addLast(1);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Dodawanie na koniec - LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.get(0);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Zwracanie wartości na początku - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.getFirst();
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Zwracanie wartości na początku - LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.get(50000);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Zwracanie wartości ze środka - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.get(50000);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Zwracanie wartości ze środka- LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.get(100000);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Zwracanie wartości z końca - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.getLast();
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Zwracanie wartości z końca - LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.remove(0);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Usuwanie z początku - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.removeFirst();
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Usuwanie z początku - LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.remove(50000);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Usuwanie ze środka - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.remove(50000);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Usuwanie z środka - LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            al.remove(al.size()-1);
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Usuwanie ze końca - ArrayList: " + (czasPo-czasPrzed) +" ms" );
        
        czasPrzed = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            ll.removeLast();
        }
        czasPo = System.currentTimeMillis();
        System.out.println("Usuwanie z końca - LinkedList: " + (czasPo-czasPrzed) +" ms" );
        
    }
}
