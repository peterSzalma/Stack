public class App {

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println("Top: " + stack.peek());
    }
}
