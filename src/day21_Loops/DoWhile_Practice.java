package day21_Loops;
/*
branching statements:
continue: can ONLY be used in loops ==> SKIPS THE ITERATION and JUMPS TO NEXT ONE
break: can ONLY be used in loops and switch ==> EXIT THE LOOP and SWITCH
system.exit(0): can be used anywhere ==> TERMINATES EVERYTHING
 */
public class DoWhile_Practice {
    public static void main(String[] args) {
        int num = 1;
        do {
            System.out.print(num + " ");

            num++;

        } while (num <= 20);

        System.out.println();

        System.out.println(num);

        System.out.println("==================================");

        char ch = 'Z';
        do {
            System.out.print(ch+" ");
            ch--;
        } while (ch >= 'A');

    }
}
