import java.util.EmptyStackException;

public class MainStackArrayList {
    public static void main(String[] args) throws EmptyStackException {
        StackArrayList<String> stack = new StackArrayList<>();
        stack.push("aaaaaaa");
        stack.push("bbbbbbb");
        stack.push("ccccccc");
        System.out.println(stack);
        System.out.println(stack.pop());

    }
}
