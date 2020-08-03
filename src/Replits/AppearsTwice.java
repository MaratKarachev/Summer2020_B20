package Replits;

public class AppearsTwice {
        public static void main(String[] args) {
            System.out.println("Hello world!");
        }

        /**
         *target - string that you need to check.
         * sentence - string where you need to lookup for target.
         *
         */
        public static boolean appearsTwice(String target, String sentence) {
            //write your codes here:
            int count = 0;
            for(String each : sentence.split(" ")){
                if(target.equals(each)){
                    count++;
                }
            }
            return count == 2 ? true:false;
        }
    }


