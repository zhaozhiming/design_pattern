package design.pattern.state;

public class BugManager {
    private BugState bugState;
    private BugState submitState;
    private BugState devState;
    private BugState reviewState;
    private Expert expert;
    private BugState fixedState;

    public BugManager() {
        this.submitState = new SubmitState();
        this.devState = new DevState();
        this.reviewState = new ReviewState();
        this.fixedState = new FixedState();
    }

    public void findBug() {
        bugState = submitState;
    }

    public String getCurrentBugState() {
        return bugState.toString();
    }

    public String submit() {
        return bugState.handle(this);
    }

    public BugState getDevState() {
        return devState;
    }

    public void setBugState(BugState bugState) {
        this.bugState = bugState;
    }

    public String dev() {
        return bugState.handle(this);
    }

    public BugState getReviewState() {
        return reviewState;
    }

    public String review(Expert expert) {
        setExpert(expert);
        return bugState.handle(this);
    }

    public void setExpert(Expert expert) {
        this.expert = expert;
    }

    public String getExpertOpinion() {
        return expert.getOpinion();
    }

    public BugState getFixedState() {
        return fixedState;
    }

}
