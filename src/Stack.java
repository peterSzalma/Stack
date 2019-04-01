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

    public void push(int i) {
        stackArray[++top] = i;
        System.out.println(i + " pushed into stack");
    }

    @Override
    public String toString() {
        return "stackArray=" + Arrays.toString(stackArray);
    }
}
