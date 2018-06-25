package Test;

import Entity.Devices.Device;
import Entity.Devices.DeviceType;
import Entity.MaintenanceSystem;
import Entity.Plans.Plan;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MaintenanceSystemTest { 

    @Before
    public void before() throws Exception {
        System.out.println("Before MaintenanceSystemTest");
    }

    @After
    public void after() throws Exception {
        System.out.println("After MaintenanceSystemTest");
    }

    /**
     *
     * Method: addDevice(String device, String type, String location)
     *
     */
    @Test
    public void testAddDevice() throws Exception {


        MaintenanceSystem maintenanceSystem = new MaintenanceSystem();
        Device device1 =  maintenanceSystem.addDevice("pump", "9001", "z2101");
        Device device2 = maintenanceSystem.addDevice("pump", "9002", "z2102");
        Device device3 = maintenanceSystem.addDevice("elevator", "9001", "z2103");
        Device device4 = maintenanceSystem.addDevice("elevator", "9002", "z2104");
        Device device5 = maintenanceSystem.addDevice("airConditioner", "9001", "z2105");
        Device device6 = maintenanceSystem.addDevice("airConditioner", "9002", "z2106");


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

    /**
     *
     * Method: addPlan(String type, Device device)
     *
     */
    @Test
    public void testAddPlan() throws Exception {
        MaintenanceSystem maintenanceSystem = new MaintenanceSystem();

        Device device =  maintenanceSystem.addDevice("pump", "9001", "z2101");

        maintenanceSystem.addPlan("small", device);
        maintenanceSystem.addPlan("big", device);

        Device device1 = maintenanceSystem.getDevice(0);

        ArrayList<Plan> plans1 = device1.getPlans();

        assert plans1.size() == 2;
        assert plans1.get(0).getPlanDescription().equals("Small Maintenance");
        assert plans1.get(0).getPeriod() == 30;

        assert plans1.get(1).getPlanDescription().equals("Big Maintenance");
        assert plans1.get(1).getPeriod() == 60;
    }

    /**
     *
     * Method: alertRecentMaintenanceDevice()
     *
     */
    @Test
    public void testAlertRecentMaintenanceDevice() throws Exception {
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = dateFormat1.parse("2018-08-17");
        MaintenanceSystem maintenanceSystem = new MaintenanceSystem(myDate);

        Device device1 =  maintenanceSystem.addDevice("pump", "9001", "z2101");
        Device device2 = maintenanceSystem.addDevice("elevator", "9002", "z2102");

        maintenanceSystem.addPlan("small", device1);
        maintenanceSystem.addPlan("big", device2);

        ArrayList<Device> alertedDevices = maintenanceSystem.alertRecentMaintenanceDevice();

        assert alertedDevices.size() == 2;

        assert alertedDevices.get(0).getDeviceLog().getDeviceName().equals("Pump");
        assert alertedDevices.get(0).getDeviceLog().getDeviceType() == DeviceType.Pump;
        assert alertedDevices.get(0).getDeviceLog().getLocation().equals("z2101");
        assert alertedDevices.get(0).getDeviceLog().getModel().equals("9001");

        assert alertedDevices.get(1).getDeviceLog().getDeviceName().equals("Elevator");
        assert alertedDevices.get(1).getDeviceLog().getDeviceType() == DeviceType.Elevator;
        assert alertedDevices.get(1).getDeviceLog().getLocation().equals("z2102");
        assert alertedDevices.get(1).getDeviceLog().getModel().equals("9002");

    }


} 
