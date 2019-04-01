import java.util.Arrays;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[max];
        top = -1;
    }
}
