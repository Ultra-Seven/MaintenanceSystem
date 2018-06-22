package Entity.Devices;

/**
 * Created by Administrator on 2018/6/16.
 */
public class Pump extends Device {

    public Pump() {
        this.deviceLog = new DeviceLog();
        this.deviceLog.setDeviceName("Pump");
        this.deviceLog.setDeviceType(DeviceType.Pump);
    }

    @Override
    public Device getDevice() {
        return this;
    }
}

