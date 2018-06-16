package Dao.Impl;

import Dao.IDevice;
import Entity.Devices.Device;
import Entity.Devices.DeviceFactory;
import Entity.Plans.BigMaintenance;
import Entity.Plans.SmallMaintenance;

import java.util.ArrayList;

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
}
