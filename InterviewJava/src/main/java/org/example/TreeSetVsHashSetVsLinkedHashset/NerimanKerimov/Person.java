package org.example.TreeSetVsHashSetVsLinkedHashset.NerimanKerimov;

public class Person  implements Comparable<Person>{
    private int a;

    public Person(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }


    @Override
    public int compareTo(Person o) {
        return this.getA()-o.getA();
    }


}
