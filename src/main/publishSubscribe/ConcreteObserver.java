package main.publishSubscribe;

public class ConcreteObserver extends Observer {
    private String name;
    private String status;
    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConcreteSubject getSub() {
        return subject;
    }

    public void setSub(ConcreteSubject sub) {
        this.subject = sub;
    }

    @Override
    public void update() {
        status = subject.getSubjectState();
        System.out.println("The new status of " + this.name + " is " + this.status);
    }

}
