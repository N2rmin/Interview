package org.example.LambdaExpression.CodingWithJohn;

public class Lambdas {
    public static void main(String[] args) {




        Printable lambdaPrintable = (p,s)-> p+"Meow" +s;

        printThing( lambdaPrintable);


    }


    static void printThing(Printable thing){
        thing.print("-","!");
    }

}
