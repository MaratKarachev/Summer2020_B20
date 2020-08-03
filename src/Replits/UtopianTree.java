package Replits;

public class UtopianTree {

    public static void main(String[] args) {


        int treeSize = 0;

        for (int year = 1; year <= 10; year++) {
            if (year <= 3) {
                treeSize += 1;
                System.out.println("year "+year+"-growth 1 cm");
            } else {
                treeSize += 2;
                System.out.println("year "+year+"-growth 2 cm");
            }
            System.out.println("tree size:"+ treeSize+"cm");

        }
    }
}