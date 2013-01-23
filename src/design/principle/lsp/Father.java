package design.principle.lsp;

import java.util.List;

public class Father {
    public void action(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }
}
