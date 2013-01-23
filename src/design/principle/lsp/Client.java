package design.principle.lsp;

import static java.util.Arrays.asList;

public class Client {
    public static void main(String[] args) {
        Son son = new Son();
        son.action(asList("test1", "test2"));
    }
}
