package Replits;
import java.util.ArrayList;
public class ArrayListRepeatAll {

        public static void main(String[] args)
        {

        }
        //create your method below
        public static void repeatAl (ArrayList<Boolean> lst){

            int count = lst.size();
            for(int i=0; i<count; i++){
                lst.add(lst.get(i));
            }


        }
    }

