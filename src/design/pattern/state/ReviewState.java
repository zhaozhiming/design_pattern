package design.pattern.state;

public class ReviewState implements BugState {
    @Override
    public String handle(BugManager bugManager) {
        if (bugManager.getExpertOpinion().equals("通过")) {
            bugManager.setBugState(bugManager.getFixedState());
            return "缺陷修复完成，本次修改结束";
        }
        bugManager.setBugState(bugManager.getDevState());
        return "缺陷开发有问题，回到开发状态";
    }

    @Override
    public String toString() {
        return "复审状态";
    }
}
