package InterviewQuestions;
/*
Write a return  method that can find the unique characters from the String
​
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */

public class FindUnique {


        public static String findUniques(String str){   //"AAABBBCCCDEF"

            String uniques="";

            String [] strArr = str.split("");   //{"A", "B","C".....}

            for (String a:strArr){  // a = every single element of strArr
                int num=0;
                for (String b:strArr){  // b = every single element of strArr
                    if (a.equals(b)){
                        num++;
                    }
                }
                if (num==1){        //uniques+=(num==1)?a:"";
                    uniques+=a;
                }
            }
            return uniques;
        }

        //a : //"AAABBBCCCDEF"

        //b:  //"AAABBBCCCDEF"


        public static void main(String[] args) {

            System.out.println(findUniques("AAABBBCCCDEF"));

        }

    }