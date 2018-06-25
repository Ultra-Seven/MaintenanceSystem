package Test.Entity.Devices;

import Entity.Devices.Device;
import Entity.Devices.DeviceFactory;
import Entity.Devices.DeviceType;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

public class DeviceFactoryTest { 

    @Before
    public void before() throws Exception {
        System.out.println("Before DeviceFactoryTest");
    }

    @After
    public void after() throws Exception {
        System.out.println("After DeviceFactoryTest");
    }

    /**
    *
    * Method: createDevice(String device, String type, String location)
    *
    */
    @Test
    public void testCreateDevice() throws Exception {
    //TODO: Test goes here...
        DeviceFactory deviceFactory = new DeviceFactory();

        Device device1 = deviceFactory.createDevice("pump", "9001", "z2101");
        Device device2 = deviceFactory.createDevice("pump", "9002", "z2102");
        Device device3 = deviceFactory.createDevice("elevator", "9001", "z2103");
        Device device4 = deviceFactory.createDevice("elevator", "9002", "z2104");
        Device device5 = deviceFactory.createDevice("airConditioner", "9001", "z2105");
        Device device6 = deviceFactory.createDevice("airConditioner", "9002", "z2106");

        assert device1.getDeviceLog().getDeviceName().equals("Pump");
        assert device1.getDeviceLog().getDeviceType() == DeviceType.Pump;
        assert device1.getDeviceLog().getLocation().equals("z2101");
        assert device1.getDeviceLog().getModel().equals("9001");

        assert device2.getDeviceLog().getDeviceName().equals("Pump");
        assert device2.getDeviceLog().getDeviceType() == DeviceType.Pump;
        assert device2.getDeviceLog().getLocation().equals("z2102");
        assert device2.getDeviceLog().getModel().equals("9002");

        assert device3.getDeviceLog().getDeviceName().equals("Elevator");
        assert device3.getDeviceLog().getDeviceType() == DeviceType.Elevator;
        assert device3.getDeviceLog().getLocation().equals("z2103");
        assert device3.getDeviceLog().getModel().equals("9001");

        assert device4.getDeviceLog().getDeviceName().equals("Elevator");
        assert device4.getDeviceLog().getDeviceType() == DeviceType.Elevator;
        assert device4.getDeviceLog().getLocation().equals("z2104");
        assert device4.getDeviceLog().getModel().equals("9002");

        assert device5.getDeviceLog().getDeviceName().equals("AirConditioner");
        assert device5.getDeviceLog().getDeviceType() == DeviceType.AirConditioner;
        assert device5.getDeviceLog().getLocation().equals("z2105");
        assert device5.getDeviceLog().getModel().equals("9001");

        assert device6.getDeviceLog().getDeviceName().equals("AirConditioner");
        assert device6.getDeviceLog().getDeviceType() == DeviceType.AirConditioner;
        assert device6.getDeviceLog().getLocation().equals("z2106");
        assert device6.getDeviceLog().getModel().equals("9002");


    }

} 
