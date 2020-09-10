package Replits;

public class calc2_Encapsulation {

    private int x;
    private int y;
    private int result;

    public void plus() {
        this.result = x+y;
    }

    public void minus() {
        this.result = x-y;
    }


    public int getResult() {
        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
