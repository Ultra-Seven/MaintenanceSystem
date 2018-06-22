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

    private ArrayList<Plan> plans = new ArrayList<>();

    public ArrayList<Plan> getPlans() {
        return this.plans;
    }

    public void addMaintenanceLog(MaintenanceLog log) {
        maintenanceLogs.add(log);
    }

    public ArrayList<MaintenanceLog> getMaintenanceLogs() {
        return maintenanceLogs;
    }

    public DeviceLog getDeviceLog() {
        return deviceLog;
    }

    public abstract Device getDevice();
}

