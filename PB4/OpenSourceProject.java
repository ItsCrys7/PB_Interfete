package PB4;

public class OpenSourceProject extends Project {
    private String mailingList;

    public OpenSourceProject(String title, String objective, long funds, Member manager, String mailingList) {
        super(title, objective, funds, manager);
        this.mailingList = mailingList;
    }

    @Override
    public double getRisk() {
        return (members.size() * 1.0) / funds;
    }
}
