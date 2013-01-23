package design.pattern.prototype;

public class Client {

    public String login(IndividualUser individualUser, String userName) {
        try {
            IndividualUser newIndividualUser = (IndividualUser) individualUser.clone();
            return newIndividualUser.login(userName);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("克隆失败");
        }
    }

    public String login(EnterpriseUser enterpriseUser, String userName) {
        try {
            EnterpriseUser newEnterpriseUser = (EnterpriseUser) enterpriseUser.clone();
            return newEnterpriseUser.login(userName);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("克隆失败");
        }
    }
}
