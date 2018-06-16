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
    public double maintenancePlan() {
        return 0;
    }
}

class Pump9001 extends Pump {
    public Pump9001(String location) {
        this.deviceLog.setModel("9001");
        this.deviceLog.setLocation(location);
    }
}

class Pump9002 extends Pump {
    public Pump9002(String location) {
        this.deviceLog.setModel("9002");
        this.deviceLog.setLocation(location);
    }
}
