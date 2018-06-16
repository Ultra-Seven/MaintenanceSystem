import Dao.Impl.DeviceImpl;
import Entity.Devices.Device;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 2018/6/16.
 */
public class MaintenanceSystem {
    private ArrayList<Device> devices = new ArrayList<>();
    private Date date = new Date();
    private DeviceImpl device = new DeviceImpl();


    public void addDevice(String device, String type, String location) {

    }

    public void addPlan(String type, Device device) {

    }

    public void removeDevice(Device device) {
        this.devices.remove(device);
    }
}
