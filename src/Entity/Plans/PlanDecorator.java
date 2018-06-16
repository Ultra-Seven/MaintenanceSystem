package Entity.Plans;

import Entity.Devices.Device;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/6/16.
 */
public abstract class PlanDecorator extends Device {
    public abstract ArrayList<Plan> getPlans();
}
