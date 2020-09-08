package day51_Exceptions;

/*
Exception topics:
unchecked & checked
try & catch
multi-catch
finally
throws
throw
custom exception


Exception: unexpected or unwanted event
two types of exceptions
unchecked(unexpected): occurs during runtime
    RuntimeException class is the parent of all unchecked exception classes

checked(unwanted): occurs during compile time, will give compile error immediately

Exception Handling:
try & catch: blocks that used for handling exception
try {
exception statement
}catch(ExceptionClass e){
statements
}

 */

public class ExceptionsIntro {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("Test started");

        // System.out.println(arr[100]); //unchecked exceptions(unexpected event)

        // Thread.sleep(3000); //checked exception(unwanted event)

        String str = "Cybertek";

        // System.out.println(str.charAt(-1)); //unchecked

        System.out.println("Step 2");


    }
}
