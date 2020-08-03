package day19_ForLoop;

public class breakStatement {
    public static void main(String[] args) {

        //break statement: used for exiting switch and loops

        for (char ch = 'A'; ch <= 'H'; ch++) { //ch:A

            System.out.print(ch + " "); //A B C
            if (ch == 'C') {
                break;
            }
        }
        System.out.println();
        System.out.println("====================================");

        for (int i = 10; i <= 50; i += 10) { // i: 10, 20, 30, 40, 50, 60<50 false, loop won't execute after 50

            if (i == 30) {
                break;
            }
            System.out.print(i + " "); //10 20
        }
        System.out.println();
        System.out.println("====================================");

        for (int x = 1000; x >= 100; x -= 100) { // x: 1000, 900, 800, 700, 600, 500, 400, 300, 200, 100
            if (x == 500) {
                break; //exits the loop
            }
            System.out.print(x + " ");
            }
        }
    }

