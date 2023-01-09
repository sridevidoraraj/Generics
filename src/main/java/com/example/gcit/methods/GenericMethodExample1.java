package com.example.gcit.methods;

public class GenericMethodExample1<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }
    public static <T> boolean isEqual(GenericMethodExample1<T> g1, GenericMethodExample1<T> g2){
        return g1.get().equals(g2.get());
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }
}
