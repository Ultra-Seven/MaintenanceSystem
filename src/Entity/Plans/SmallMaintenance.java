package Entity.Plans;

import Entity.Devices.Device;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/6/16.
 */
public class SmallMaintenance extends PlanDecorator {
    Device device;
    public SmallMaintenance(Device device) {
        this.device = device;
    }



    @Override
    public double maintenancePlan() {
        return 0;
    }

    @Override
    public ArrayList<Plan> getPlans() {
        device.getPlans().add(new Plan("Small Maintenance", 30));
        return device.getPlans();
    }
}
