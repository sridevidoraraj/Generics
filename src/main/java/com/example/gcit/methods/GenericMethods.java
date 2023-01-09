package com.example.gcit.methods;

public class GenericMethods {
    public static <T> boolean isEqual(GenericMethodExample1<T> g1, GenericMethodExample1<T> g2){
        return g1.get().equals(g2.get());
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

    public static void main(String args[]){
        GenericMethodExample1<String> g1 = new GenericMethodExample1<>();
        g1.set("demo");

        GenericMethodExample1<String> g2 = new GenericMethodExample1<>();
        g2.set("demo");

        boolean isEqual = GenericMethods.<String>isEqual(g1, g2);

        System.out.println(isEqual);
        //above statement can be written simply as
        isEqual = GenericMethods.isEqual(g1, g2);

        System.out.println(isEqual);

        System.out.println(GenericMethods.compare("abc","abc"));
    }
}
