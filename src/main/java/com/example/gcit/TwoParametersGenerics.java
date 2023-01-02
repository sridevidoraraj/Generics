package com.example.gcit;

public class TwoParametersGenerics {
    public static void main(String a[]){

        SimpleGen<String, Integer> sample
                = new SimpleGen<String, Integer>("JAVA", 100);
        sample.printTypes();
    }
}

class SimpleGen<U, V>{

    private U obj1;
    private V obj2;

    public SimpleGen(U objU, V objV){
        this.obj1 = objU;
        this.obj2 = objV;
    }

    public void printTypes(){
        System.out.println("U Type: "+this.obj1.getClass().getName());
        System.out.println("V Type: "+this.obj2.getClass().getName());
    }
}
