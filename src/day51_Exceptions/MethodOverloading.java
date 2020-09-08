package day51_Exceptions;
/*
method overloading: same method name, different parameter
                    access modifier does not matter
                    return-type does not matter
                    any method can be overload
 */

public class MethodOverloading {

    public void method(int a){

    }

    private void method(double b){

    }

    protected long method(long c){
        return 10;
    }


}

