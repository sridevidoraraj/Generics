package com.example.gcit;

public class GenericClassExample {
    public static void main(String a[]){

        SimpleGeneric<String> sgs = new SimpleGeneric<String>("JAVA");
        sgs.printType();

        SimpleGeneric<Boolean> sgb = new SimpleGeneric<Boolean>(Boolean.TRUE);
        sgb.printType();
    }
}

class SimpleGeneric<T>{

    private T obj = null;

    public SimpleGeneric(T param){
        this.obj = param;
    }

    public T getObj(){
        return this.obj;
    }

    public void printType(){
        System.out.println("Type: "+obj.getClass().getName());
    }
}
