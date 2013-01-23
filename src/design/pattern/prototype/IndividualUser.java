package design.pattern.prototype;

public class IndividualUser implements User, Cloneable {
    private static final String POSITIONS = "职位:\n" +
            "初级开发,甲公司,5000RMB\n" +
            "资深开发,乙公司,10000RMB\n" +
            "架构师,丙公司,15000RMB";

    private String type;
    private String message;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String login(String userName) {
        return "欢迎您," + type + ":" + userName + "\n" + message;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        IndividualUser clone = (IndividualUser) super.clone();
        clone.setType("个人用户");
        clone.setMessage(POSITIONS);
        return clone;
    }
}
