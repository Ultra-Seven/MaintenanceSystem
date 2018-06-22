package Entity.Devices;

/**
 * Created by Administrator on 2018/6/16.
 */
public class Elevator extends Device {

    public Elevator() {
        this.deviceLog = new DeviceLog();
        this.deviceLog.setDeviceName("Elevator");
        this.deviceLog.setDeviceType(DeviceType.Elevator);
    }

    @Override
    public Device getDevice() {
        return this;
    }
}