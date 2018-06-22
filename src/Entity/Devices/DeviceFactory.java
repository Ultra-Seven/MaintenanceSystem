package Entity.Devices;

/**
 * Created by Administrator on 2018/6/16.
 */
public class DeviceFactory {
    public DeviceFactory() {

    }
    public Device createDevice(String device, String type, String location) {
        switch (device) {
            case "pump":
                return createPump(type, location);
            case "elevator":
                return createElevator(type, location);
            case "airConditioner":
                return createAirConditioner(type, location);
            default:
                break;
        }
        return null;
    }
    private Pump createPump(String type, String location) {
        switch (type) {
            case "9001":
                return new Pump9001(location);

            case "9002":
                return new Pump9002(location);

            default:
                break;
        }
        return null;
    }

    private Elevator createElevator(String type, String location) {
        switch (type) {
            case "9001":
                return new Elevator9001(location);

            case "9002":
                return new Elevator9002(location);

            default:
                break;
        }
        return null;
    }

    private AirConditioner createAirConditioner(String type, String location) {
        switch (type) {
            case "9001":
                return new AirConditioner9001(location);

            case "9002":
                return new AirConditioner9002(location);

            default:
                break;
        }
        return null;
    }
}
