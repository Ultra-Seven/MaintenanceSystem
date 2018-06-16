package Entity.Plans;

/**
 * Created by Administrator on 2018/6/16.
 */
public class Plan {
    private String planDescription = "";
    private int period = 0;

    public Plan(String description, int period) {
        this.planDescription = description;
        this.period = period;
    }

    public String getPlanDescription() {
        return planDescription;
    }

    public void setPlanDescription(String planDescription) {
        this.planDescription = planDescription;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
