package day08_LogicalOperators;

public class Post_Pre {
    public static void main(String[] args) {

        int a=200;
        int b=-a++ + - --a * a-- %2;
        //-200 - 200 * 200 %2 =40,000%2=0
        //-200 + 0
        //-200
        System.out.println(b);

        int x=300;
        int y=400;
        int z=x+y-x*y+x/y;
        // 300+400-300*400+300/400;
        // 300+400-120,000+0 (Because integer number gives only 0 and not 0.75;
        // 700-120,000+0.75 = -119,300
        System.out.println(z);
    }
}
