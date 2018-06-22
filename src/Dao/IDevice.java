package Dao;

import Entity.Devices.Device;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/16.
 */
public interface IDevice {
    public Device newDevice(String device, String type, String location);
    public void addDevice(Device device);
    public void removeDevice(Device device);
    public Device newPlan(String type, Device device);
    public ArrayList<Device> alertRecentMaintenanceDevices(Date date);
}
