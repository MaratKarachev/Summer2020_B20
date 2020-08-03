package Office_Hours.Practice_07_20_2020;

public class Max_3DArray {
    public static void main(String[] args) {

        //  int[][] arr2D = {{1, 2}, {3, 4}};
        //                      0       1           0        1
        int[][][] arr3D = {{{1, 2,}, {3, 4000}}, {{5, 6, 7}, {8, 9, 10}}};
        // index#                     0                  1

        int max = arr3D[0][0][0];

        for (int[][] each2D : arr3D) {
            for (int[] each1D: each2D){
                for(int eachElement : each1D){
                    if(eachElement>max){
                        max=eachElement;
                    }
                }

            }
        }
        System.out.println("Maximum: "+max);


        //  int[][] arr2D = {{1, 2}, {3, 4}};
        //                      0       1           0        1
        int[][][] arr4D = {{{1, 2}, {3, 4000}}, {{5, 6, 0,-100}, {8, 9, 10}}};
        // index#                     0                  1

        int min = arr4D[0][0][0];

        for (int[][] each5D : arr4D) {
            for (int[] each6D: each5D){
                for(int eachElement : each6D){
                    if(eachElement<min){
                        min=eachElement;
                    }
                }

            }
        }
        System.out.println("Minimum: "+min);
    }
}
