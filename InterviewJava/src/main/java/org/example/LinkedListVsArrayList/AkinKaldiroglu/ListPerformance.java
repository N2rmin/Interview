package org.example.LinkedListVsArrayList.AkinKaldiroglu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
LinkList ArrayListe oldugu kimi indexs verilmez , obyektler referanslarla(pointer) bir-birine baglanaraq listi yaradirlar.
LinkedList-de element ozunden sagda ve solda duran elementlere linkle bagli oldugundan  getirerken suret baximdan geri qalir.
LinkedList eyni zamanda Queue oldugundan Queue methodlarin istifade eder.
Elemente muracietde ArrayList Sabit O(1) performansı olanda, LinkedList elemetleri linkler uzerinden getek tapildigi ucub duz bir O(n) performasina sahipdir.
basa ve araya Əlavə etmək və çıxarmaqda isə ArrayList O(n) LinkList O(1) performansa sahib.
cunki arrayliste basina element elave edildikde ideger elementlerin indexlerini surusdurur.
Buna gore eger basa(evvele) veya araya əlavə etmək və silmək işləmi olacaqsa LinkedList, olmayacaqsa ArrayList tərcih olunmalıdır.
*/

public class ListPerformance {
    private  static int n = 100_000;

    public static void main(String[] args) {
        arrayListInsertion();
        linkedListInsertion();
    }


    public static ArrayList arrayListInsertion(){
        ArrayList aList = new ArrayList();
        double start1= System.currentTimeMillis();
        for (int i = 0; i<n; i++){

           // aList.add(i); // sona elave etmek.
            aList.add(0,i); // basa (evvele) elave etmek
        }
        double end1= System.currentTimeMillis();
        System.out.println("Time for ArrayList is "+(end1-start1));
        return aList;
    }


      public static List linkedListInsertion(){
          List lList= new LinkedList();
          double start2=System.currentTimeMillis();
          for (int i = 0; i<n; i++){
             // lList.add(i);// sona elave etmek.
              lList.add(0,i); // basa (evvele) elave etmek
          }
          double end2= System.currentTimeMillis();
          System.out.println("Time for LinkedList is "+(end2-start2));
          return lList;
        }
    }

