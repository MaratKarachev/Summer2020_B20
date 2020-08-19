package Replits;

public class getDuplicates {


        public static int getDup(String[] r) {
            String dup = "";
            int count = 0;

            for(String each:r){ //10,20,aa,10
                count =0;
                for(String each2:r){ //10,20,aa,10
                    if(each.equals(each2)){
                        count++;
                    }
                }
                if(count>1){
                    dup+=each+" ";//10,10
                }
            }
            return dup.split(" ").length;
        }
    }

