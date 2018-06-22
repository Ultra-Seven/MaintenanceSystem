package Entity;

import Dao.Impl.DeviceImpl;
import Entity.Devices.Device;

import java.util.ArrayList;
import java.util.Date;

public class MaintenanceSystem {
    private Date date;
    private DeviceImpl deviceImpl = new DeviceImpl();

    public MaintenanceSystem() {
        date = new Date();
    }

    public MaintenanceSystem(Date date) {
        if (date != null) {
            this.date = date;
        }
        else {
            this.date = new Date();
        }
    }

    public Device addDevice(String device, String type, String location) {
        Device newDevice = deviceImpl.newDevice(device, type, location);
        deviceImpl.addDevice(newDevice);
        return newDevice;
    }

    public void addPlan(String type, Device device) {
        Device deviceWithPlan = deviceImpl.newPlan(type, device);
        deviceImpl.removeDevice(device);
        deviceImpl.addDevice(deviceWithPlan.getDevice());
    }

    public ArrayList<Device> alertRecentMaintenanceDevice() {
        return deviceImpl.alertRecentMaintenanceDevices(this.date);
    }

    public Device getDevice(int index) {
        return deviceImpl.getDevice(index);
    }


}
