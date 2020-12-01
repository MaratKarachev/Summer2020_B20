package InterviewQuestions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
public class ArrayListRemoveName {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Marat", "Altay", "Tetiana", "Diana", "Jessica", "Jessica"));
        names.removeAll(Arrays.asList("Jessica"));
        System.out.println(names);

    }
}
