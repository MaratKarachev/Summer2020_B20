package Day24_Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class ZombieAttack1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

        while (inhabitants > 0) {
            System.out.println("Day" + day++ + "[" + inhabitants + "]");

            inhabitants /= 2;
        }
        System.out.println("----EXTINCT----");
    }
}