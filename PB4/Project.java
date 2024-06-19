package PB4;

import java.util.ArrayList;
import java.util.List;

public abstract class Project implements Risky {
    protected String title;
    protected String objective;
    protected long funds;
    protected Member manager;
    protected List<Member> members;

    public Project(String title, String objective, long funds, Member manager) {
        this.title = title;
        this.objective = objective;
        this.funds = funds;
        this.manager = manager;
        this.members = new ArrayList<>();
    }

    public void addMember(Member m) {
        members.add(m);
    }

    public String getTitle() {
        return title;
    }

    public String getObjective() {
        return objective;
    }

    public long getFunds() {
        return funds;
    }

    public Member getManager() {
        return manager;
    }

    public List<Member> getMembers() {
        return members;
    }

    public abstract double getRisk();
}
