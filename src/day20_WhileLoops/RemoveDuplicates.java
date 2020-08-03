package day20_WhileLoops;

/*
write a program that can remove the duplicates from any given string
ex: input: abcabcaabb
output: abc
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbccccddddeeeeefffffggggghhhiiii"; //"ab"
        //            0123

        String result = ""; //"a"

        for (int i = 0; i <= str.length() - 1; i++) {
            String s = "" + str.charAt(i); //a,a,b,b
            if (!result.contains(s)) { // if the character is already contained in result, we will not add it.
                result +=s;

            }
        }
        System.out.println(result);
    }
}
