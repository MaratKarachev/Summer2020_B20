package day28_recap;

/*
 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour
 */

public class FrequencyOfWord {
    public static void main(String[] args) {
        String str = "javajavajavaJavaJavaJAVA";
        //            01234567

        //substring(0,4) ==>java
        //substring(1,5) ==>avaj
        //substring(2,6) ==>vaja
        //substring(3,7) ==>ajav
        //substring(4,8) ==>java

        //substring(i, i+4)

        int count = 0;
        for(int i = 0; i<=str.length()-4; i++){ // index of i: 0,1,2,3,4,5,6,7
            String s = str.substring(i,i+4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }

        }

        System.out.println(count);
    }
}
