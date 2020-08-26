package Replits;

public class Paragraph {
    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String vowels = "aeiouAEIOU";
        int count = 0;
        for(int i=0; i<text.length(); i++){
            if(vowels.contains(text.substring(i,i+1))){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
