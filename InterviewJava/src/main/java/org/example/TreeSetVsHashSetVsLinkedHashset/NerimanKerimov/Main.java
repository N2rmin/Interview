package org.example.TreeSetVsHashSetVsLinkedHashset.NerimanKerimov;

import java.util.*;

/*
Setler (dublicate data saxlamir)/ 1 null elave etmek olar.
LinkedHashSet de elementler daxil  oldugu sira ile siralanmis  olur .
TreeSet de elementler sirali olur(herfdirse elifba ile) . Null deyer qebul etmir (Run timeda error(unchecked) verir).
TreeSet bir basa Set-den implement olmur Set->NavigableSet->OrderedSet->TreeSet
Eger ozumuz Obyekt yaradib TreeSetde onu elave etsek bize problem yaracaq cunki neye esasen siralayacagini bilmeyecek.
Bu problemi hell etmek ucun yaratdigimiz obyete comparable interfeysini implement edib compareTo methodunu override edirik.
Lakin compareTo methoduna oz hesablamamizi yaziriqki hesablama edib butun elementleri qaytarsin eks halda return 0 olduqdan yalniz bir element qaytarir.
* */
public class Main {
    public static void main(String[] args) {
        //   Scanner sc = new Scanner(System.in);
       // HashSet<String> hs = new HashSet<>();
       // LinkedHashSet<String> hs = new LinkedHashSet<>();
      // TreeSet<String> hs = new TreeSet<>();


      Person person1= new Person(10);
      Person person2= new Person(13);
      Person person3= new Person(15);


      //  Set<Person>  persons= new HashSet<>();
        //Set<Person>  persons= new LinkedHashSet<>();
        Set<Person>  persons= new TreeSet<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        for (Person person: persons){
            System.out.println(person.getA());
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