package Dao.Impl;

import Dao.IDevice;
import Entity.Devices.Device;
import Entity.Devices.DeviceFactory;
import Entity.Plans.BigMaintenance;
import Entity.Plans.Plan;
import Entity.Plans.SmallMaintenance;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/6/16.
 */
public class DeviceImpl implements IDevice {
    private DeviceFactory deviceFactory = new DeviceFactory();
    private ArrayList<Device> devices = new ArrayList<>();
    @Override
    public Device newDevice(String device, String type, String location) {
        return deviceFactory.createDevice(device, type, location);
    }

    @Override
    public void addDevice(Device device) {
        this.devices.add(device);
    }

    @Override
    public void removeDevice(Device device) {
        this.devices.remove(device);
    }

    @Override
    public Device newPlan(String type, Device device) {
        switch (type) {
            case "small":
                return new SmallMaintenance(device);

            case "big":
                return new BigMaintenance(device);

            default:
                break;
        }
        return device;
    }

    @Override
    public ArrayList<Device> alertRecentMaintenanceDevices(Date date) {
        ArrayList<Device> devices = new ArrayList<>();
        this.devices.forEach(device -> {
            ArrayList<Plan> plans = device.getPlans();
            int days = (int) ((date.getTime() - device.getDeviceLog().getDate().getTime()) / (1000*3600*24));

            if (plans.stream().filter(plan -> (plan.getPeriod() - days % plan.getPeriod()) <= 10).findFirst().orElse(null) != null) {
                devices.add(device);
            }

        });
        return devices;
    }

    public Device getDevice(int index) {
        return this.devices.get(index);
    }
}
