package HW8v2;

public class Controller {
    private final Saver saver;

    public Controller(Saver saver) {
        this.saver = saver;
    }

    public void save(User user) {
        saver.save(user);
    }

    public void report(User user) {
        Report.report(user);
    }
}