package design.pattern.prototype;

public interface User {
    void setType(String type);

    void setMessage(String message);

    String login(String userName);
}
