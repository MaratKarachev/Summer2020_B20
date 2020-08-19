package Replits;

import java.util.ArrayList;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        String name = "muhtar";
        String arr[] = name.split("");//{m,u,h,t,a,r}; array means same type of values;
        System.out.println(Arrays.toString(arr));
        String arr2[] = {"Marat", "Hasan", "Altay"}; // fixed size
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Marat","Hasan"));
    }
}








