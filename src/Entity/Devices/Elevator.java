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
    public double maintenancePlan() {
        return 0;
    }
}

class Elevator9001 extends Pump {
    public Elevator9001(String location) {
        this.deviceLog.setModel("9001");
        this.deviceLog.setLocation(location);
    }
}

class Elevator9002 extends Pump {
    public Elevator9002(String location) {
        this.deviceLog.setModel("9002");
        this.deviceLog.setLocation(location);
    }
}