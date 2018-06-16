package Entity.Plans;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/16.
 */
public class MaintenanceLog {
    private MaintenanceType maintenance;
    private String log;
    private String maintenanceStaff;
    private double hours;
    private Date date;
    private Plan plan;

    public MaintenanceLog(MaintenanceType maintenance, String log, String maintenanceStaff, double hours, Plan plan) {
        this.maintenance = maintenance;
        this.log = log;
        this.maintenanceStaff = maintenanceStaff;
        this.hours = hours;
        this.plan = plan;
        this.date = new Date();
    }

    public MaintenanceType getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(MaintenanceType maintenance) {
        this.maintenance = maintenance;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getMaintenanceStaff() {
        return maintenanceStaff;
    }

    public void setMaintenanceStaff(String maintenanceStaff) {
        this.maintenanceStaff = maintenanceStaff;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getTime() {
        return this.date.toString();
    }

    public String toString() {
        return plan.getPeriod() + ":" + plan.getPlanDescription();
    }
}
