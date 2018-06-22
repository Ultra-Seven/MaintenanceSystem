package Entity.Devices;

/**
 * Created by Administrator on 2018/6/16.
 */
public class AirConditioner extends Device{
    public AirConditioner() {
        this.deviceLog = new DeviceLog();
        this.deviceLog.setDeviceName("AirConditioner");
        this.deviceLog.setDeviceType(DeviceType.AirConditioner);
    }

    @Override
    public Device getDevice() {
        return this;
    }
}

