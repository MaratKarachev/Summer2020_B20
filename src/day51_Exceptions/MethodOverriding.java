package day51_Exceptions;

public class MethodOverriding {
    class A {

        protected void method() {

        }

    }


    public class methodOverriding extends A {
        /*
        method overriding: same method name, same parameter, same return-type (MUST)
                   MUST happen in sub class
                   @Override MUST be applicable (for checking)
                   Access Modifier MUST be same or more visible
                   only instance method can be override (cannot be final or private)

         */
/*
    @Override
    public int method(){
        return 10;
    }
 */


        @Override
        public void method() {

        }


        @Override
        public String toString() {
            return "example";
        }
    }
}
