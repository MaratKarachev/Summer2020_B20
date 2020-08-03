package day28_recap;

public class ArraysShortQuiz {
    public static void main(String[] args) {

        int wd = 0; //0-1+1+2+2-1=3
        String[] days = {"sun", "mon", "wed", "sat"};
        for (int i = 0; i < days.length; i++) {

            switch (days[i]) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd+=2;
            }
        }

        System.out.println(wd);

        System.out.println("=====================================");

        int [] a ={1,2,3,4};
        int y = 0;
        do{
            System.out.println(a[y]); // 1 2
            y++; //y: 1 2

        }while(y<a.length-1);

    //y<3

    }
}
