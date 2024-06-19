package PB4;

public class CommercialProject extends Project {
    private String deadline;
    private int teams;
    private long marketingFunds;

    public CommercialProject(String title, String objective, long funds, Member manager, String deadline, int teams) {
        super(title, objective, funds, manager);
        this.deadline = deadline;
        this.teams = teams;
        this.marketingFunds = funds / 2;
    }

    @Override
    public double getRisk() {
        return (teams * 3.0) / members.size() / funds - marketingFunds;
    }
}
