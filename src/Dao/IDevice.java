package Dao;

import Entity.Devices.Device;

/**
 * Created by Administrator on 2018/6/16.
 */
public interface IDevice {
    public Device newDevice(String device, String type, String location);
    public void addDevice(Device device);
    public Device newPlan(String type, Device device);
}
