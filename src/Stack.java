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

    public int pop() {
        System.out.println("Removing " + peek());
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    @Override
    public String toString() {
        return "stackArray=" + Arrays.toString(stackArray);
    }
}
