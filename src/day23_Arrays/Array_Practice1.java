package day23_Arrays;

 /*
    1.Array
    2.Collection
    3.Map


    variable: DataType name = data;
    int num =1;
    String friends = "Cybertek, "Muhtar", "Nadir"

    Array variable: a variable can have multiple data
    size is fixed

    declare:
    DataType[] arrayName = {data1, data2, data3.... };

    initializing the size only:
    DataType[] arrayName = new DataType[size];

     */

public class Array_Practice1 {
    public static void main(String[] args) {
        // String students = "Muhtar", "Nadir", "Asiya"; // cannot store more than one name


        String[] students = {"Cybertek", "Muhtar", "Nadir", "Asiya", "Saim"};
        //                        0           1        2        3       4

        String name1 = students[1];
        String name3 = students[3];


        System.out.println(name1);
        System.out.println(name3);


        System.out.println("======================================");


        int[] scores = {85, 70, 95, 90, 100}; //5
        //               0   1   2   3   4
        String[] names = {"Mike", "Adam", "Tonny", "John", "Ammy",};
        //                   0       1        2       3       4
        /*
        System.out.println(names [0] + ":" + scores[0]);
        System.out.println(names [1] + ":" + scores[1]);
        System.out.println(names [2] + ":" + scores[2]);
        System.out.println(names [3] + ":" + scores[3]);
        System.out.println(names [4] + ":" + scores[4]);
         */

        for (int i = 0; i <= 4; i++) { // i: 0,1,2,3,4
            System.out.println(names [i] + ":" + scores[i]);
        }

        System.out.println("=======================================");


        String [] classMates = new String[5]; // size is 5,
        classMates[0] = "Fatih";
        classMates[2] = "Marat";
        classMates[3] = "Vera";
        classMates[1] = "Viorel";
        classMates[4] = "Muhtar";

        //

for (int i=0; i<=classMates.length-1; i++){
    System.out.println(classMates[i]);

}


    }
}
