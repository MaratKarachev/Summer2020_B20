package day29_CustomMethods;


/*
methods: function, grouping a series of code fragments
step1:reverse a string
step2:statement
step3:reverse a string
step4:statement

Declaring methods: Must be created WITHIN the class

 public  static void main(String[] args) {}

 Access-Modifier Specifiers return-type name(parameter){
 statements;
 }

 Access-modifier:public, protected, default, private

 Specifiers: static, final, abstract synchronized

 Return-type: void, any dataType

 Parameter: any dataType

 method without parameter:
  Access-Modifier Specifiers return-type name(){
  }

 */

/*
step1: print hello 5 times
step2: print your school name
step3: print hello 5 times
step4: print your name
step5: print hello 5 times
 */

public class MethodsWithoutParameter {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            System.out.println("Hello");
        }

        System.out.println("Cybertek");

        for(int i=0; i<5; i++){
            System.out.println("Hello");
        }

        System.out.println("Marat");

        for(int i=0; i<5; i++){
            System.out.println("Hello");
        }



    }
}

