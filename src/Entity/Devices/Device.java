package Entity.Devices;

import Entity.Plans.MaintenanceLog;
import Entity.Plans.Plan;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/6/16.
 */
public abstract class Device {
    protected DeviceLog deviceLog;
    private ArrayList<MaintenanceLog> maintenanceLogs = new ArrayList<>();

    ArrayList<Plan> plans = new ArrayList<>();

    public ArrayList<Plan> getPlans()
    {
        return plans;
    }

    public abstract double maintenancePlan();
}

