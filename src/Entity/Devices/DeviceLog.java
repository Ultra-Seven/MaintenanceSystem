package Entity.Devices;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/16.
 */
public class DeviceLog {
    private String deviceName;
    private DeviceType deviceType;
    private String model;
    private String location;
    private Date date;

    public DeviceLog() {
        date = new Date();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }
}
