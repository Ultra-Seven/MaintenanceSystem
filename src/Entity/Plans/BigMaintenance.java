package Entity.Plans;

import Entity.Devices.Device;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/6/16.
 */
public class BigMaintenance extends PlanDecorator {
    private Device device;

    public BigMaintenance(Device device) {
        device.getPlans().add(new Plan("Big Maintenance", 60));
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    @Override
    public ArrayList<Plan> getPlans() {
        return device.getPlans();
    }
}
