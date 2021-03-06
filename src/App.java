public class App {

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.toString());
        System.out.println("Size: " + stack.size());
        stack.pop();
        System.out.println("Top: " + stack.peek());

        if (stack.isEmpty()) {
            System.out.println("Stack is Empty!");
        } else if (stack.isFull()) {
            System.out.println("Stack is Full!");
        } else {
            System.out.println("Stack is Not Empty!");
        }
    }
}
