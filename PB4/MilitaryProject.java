package PB4;

public class MilitaryProject extends Project {
    private String deadline;
    private String password;

    public MilitaryProject(String title, String objective, long funds, Member manager, String deadline, String password) {
        super(title, objective, funds, manager);
        this.deadline = deadline;
        this.password = password;
    }

    @Override
    public double getRisk() {
        return (members.size() * 1.0) / password.length() / funds;
    }
}
