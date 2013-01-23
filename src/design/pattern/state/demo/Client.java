package design.pattern.state.demo;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request();
        System.out.println(context.getState());

        System.out.println();
        context.request();
        System.out.println(context.getState());
    }
}
