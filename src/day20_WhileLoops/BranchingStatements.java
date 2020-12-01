package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {

        char ch = 'A';
        while (ch <='E') {
            if (ch == 'C') {
                ch++;
                continue; //skips everything even the iterator
                //break; // will exit
            }
                System.out.println(ch);

                ch++;
            }

        boolean a=true;
        while(a){
            System.out.println("RemoveDuplicatesFromArray started");
           // break; only exits the loop.
            System.exit(0); // if gets executed, entire program will be terminated.
        }
        System.out.println("Completed");

        }

    }

