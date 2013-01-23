package design.pattern.prototype;

public class EnterpriseUser implements User, Cloneable{
    private String type;
    private Position position;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setMessage(String message) {
    }

    @Override
    public String login(String userName) {
        return "欢迎您," + type + ":" + userName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        EnterpriseUser clone = (EnterpriseUser) super.clone();
        clone.setType("企业用户");
        clone.setPosition((Position) position.clone());
        return clone;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
