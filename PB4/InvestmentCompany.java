package PB4;

import java.util.ArrayList;
import java.util.List;

public class InvestmentCompany {
    private List<Project> projects;

    public InvestmentCompany() {
        this.projects = new ArrayList<>();
    }

    public void addProject(Project p) {
        projects.add(p);
    }

    public Project getBestInvestment() {
        Project bestProject = null;
        double lowestRisk = Double.MAX_VALUE;

        for (Project p : projects) {
            double risk = p.getRisk();
            if (risk < lowestRisk) {
                lowestRisk = risk;
                bestProject = p;
            }
        }

        return bestProject;
    }

    public static void main(String[] args) {
        Member manager = new Member("Alice", 35);
        CommercialProject cp = new CommercialProject("Commercial1", "E-commerce", 100000, manager, "2025-12-31", 5);
        MilitaryProject mp = new MilitaryProject("Military1", "Defense", 200000, manager, "2024-06-30", "securePass123");
        OpenSourceProject osp = new OpenSourceProject("OpenSource1", "Community Project", 50000, manager, "opensource@community.org");

        cp.addMember(new Member("Bob", 30));
        cp.addMember(new Member("Charlie", 25));
        mp.addMember(new Member("David", 40));
        osp.addMember(new Member("Eve", 22));
        osp.addMember(new Member("Frank", 28));

        InvestmentCompany ic = new InvestmentCompany();
        ic.addProject(cp);
        ic.addProject(mp);
        ic.addProject(osp);

        Project bestInvestment = ic.getBestInvestment();
        System.out.println("The best investment project is: " + bestInvestment.getTitle());
    }
}
