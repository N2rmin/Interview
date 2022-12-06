package org.example.TreeSetVsHashSetVsLinkedHashset.LogicOfComputer;

import java.util.*;

/*
Setlerde index olmaz
 Eyni elementden 1 dene elave oluna biler.(dublicate data saxlamir)/ 1 null elave etmek olar.
LinkedHashSet de elementler daxil  oldugu sira ile siralanmis  olur .
TreeSet de elementler sirali olur(herfdirse elifba ile) . Null deyer qebul etmir (Run timeda error(uncechec) verir).
TreeSet bir basa Set-den implement olmur Set->NavigableSet->OrderedSet->TreeSet
Eger ozumuz Obyekt yaradib TreeSetde onu elave etsek bize problem yaracaq cunki neye esasen siralayacagini bilmeyecek.

* */
public class Main {
    public static void main(String[] args) {
        //   Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
       // LinkedHashSet<String> hs = new LinkedHashSet<>();
      //  TreeSet<String> hs = new TreeSet<>();


        hs.add("Mehmet");
        hs.add("Hesen");
        hs.add("Kamil");
        hs.add(null);
        System.out.println(hs);
       if ( hs.remove("aa")){
           System.out.println("Removed");
       }else{
           System.out.println("Can't Removed");
       };

        Iterator<String> itr= hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
//        boolean userNameAccepted= false;
//        System.out.println("Please enter username.");
//
//        do {
//
//       String userName = sc.next();
//        if(hs.add(userName)){
//            System.out.println("UserName is valid");
//            userNameAccepted=true;
//        }else{
//            System.out.println("This userName has already taken.");
//        }
//    }while (!userNameAccepted);
//
    }
}