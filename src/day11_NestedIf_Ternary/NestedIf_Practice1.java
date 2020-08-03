package day11_NestedIf_Ternary;

public class NestedIf_Practice1 {

    /* task 01
    precondition:minimum salary of 30k
            sub condition: minimum job history of 2 years
     */
    public static void main(String[] args) {
        double salary=10000;
        double jobHistory=20;

        if(salary>=30000){
            if(jobHistory>=2){
                System.out.println("You are qualified");
            }else { // jobHistory <2
                System.out.println("You must have been employed for at least 2 years");
            }

        }else{
            System.out.println("You MUST earn at least $30k");
        }
    }
}
