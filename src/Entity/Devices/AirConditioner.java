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
    public double maintenancePlan() {
        return 0;
    }
}

class AirConditioner9001 extends Pump {
    public AirConditioner9001(String location) {
        this.deviceLog.setModel("9001");
        this.deviceLog.setLocation(location);
    }
}

class AirConditioner9002 extends Pump {
    public AirConditioner9002(String location) {
        this.deviceLog.setModel("9002");
        this.deviceLog.setLocation(location);
    }
}
