package design.pattern.observer.demo;

public class ConcreteSubject extends Subject {
    private String subjectState;

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        notifyObservers();
    }

    @Override
    protected String getState() {
        return subjectState;
    }
}
