package day44_Constructor;
   /*
    declare regular method:
    Access-Modifier Specifier ReturnType methodName(Parameters){
    statements;
    }

    Constructor: very SPECIAL method. Used when we create the object of the class
    Every class MUST have constructor, if we don't create one, compiler creates it for us

    A              obj      =    new           A();
    class name   obj name      keyword       Constructor

    declare Constructor:
    Access-Modifier className(Parameters){
    statements;
    }
    name of constructor MUST be same with class name

    Create object from class:
            ClassName obj = new ExistingConstructor
     */



public class ConstructorNotesIntro {

  public ConstructorNotesIntro (String arr){

      System.out.println("Hello "+arr);
      System.out.println("How are you "+arr);
  }




    public static void main(String[] args) {

     // ConstructorNotesIntro obj = new ConstructorNotesIntro(10);

      //  ConstructorNotesIntro obj2 = new ConstructorNotesIntro();

        ConstructorNotesIntro obj3 = new ConstructorNotesIntro( "Marat");
        ConstructorNotesIntro obj4 = new ConstructorNotesIntro( "Muhtar");
        ConstructorNotesIntro obj5 = new ConstructorNotesIntro( "Nadir");

    }
}
