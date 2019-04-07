public class application {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(30);
        myStack.push(20);
        myStack.push(7);
        myStack.push(5);
        myStack.push(100);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        Queue myQueue = new Queue();
        myQueue.enqueue(10);
        myQueue.enqueue(30);
        myQueue.enqueue(20);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
