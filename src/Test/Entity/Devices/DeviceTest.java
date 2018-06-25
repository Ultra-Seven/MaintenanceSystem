package Test.Entity.Devices;

import Entity.Devices.*;
import Entity.Plans.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;


public class DeviceTest { 

    @Before
    public void before() throws Exception {
        System.out.println("Before DeviceTest");
    }

    @After
    public void after() throws Exception {
        System.out.println("After DeviceTest");
    }

    /**
    *
    * Method: getPlans()
    *
    */
    @Test
    public void testGetPlans() throws Exception {
    //TODO: Test goes here...
        Device device = new AirConditioner9001("z2101");
        Device deviceWithSmallMaintain = new SmallMaintenance(device);
        Device deviceWithSmallBig = new BigMaintenance(deviceWithSmallMaintain);

        ArrayList<Plan> plans = deviceWithSmallBig.getPlans();


        assert plans.size() == 2;
        assert plans.get(0).getPlanDescription().equals("Small Maintenance");
        assert plans.get(0).getPeriod() == 30;

        assert plans.get(1).getPlanDescription().equals("Big Maintenance");
        assert plans.get(1).getPeriod() == 60;
    }


    /**
     *
     * Method: getMaintenanceLogs()
     *
     */
    @Test
    public void testGetMaintenanceLogs() throws Exception {
        //TODO: Test goes here...
        Device device = new AirConditioner9001("z2101");
        Device deviceWithSmallMaintain = new SmallMaintenance(device);
        Device deviceWithSmallBig = new BigMaintenance(deviceWithSmallMaintain);
        ArrayList<Plan> plans = deviceWithSmallBig.getPlans();
        MaintenanceLog log1 = new MaintenanceLog(MaintenanceType.SmallMaintenance, "replace filter net", "San Zhang", 1, plans.get(0));
        MaintenanceLog log2 = new MaintenanceLog(MaintenanceType.BigMaintenance, "clean  engine", "Si Li", 1.5, plans.get(1));

        deviceWithSmallBig.addMaintenanceLog(log1);
        deviceWithSmallBig.addMaintenanceLog(log2);

        ArrayList<MaintenanceLog> logs = deviceWithSmallBig.getMaintenanceLogs();

        System.out.println(logs.size());

        assert logs.size() == 2;

        assert logs.get(0).getMaintenanceStaff().equals("San Zhang");
        assert logs.get(0).getMaintenance() == MaintenanceType.SmallMaintenance;
        assert logs.get(0).getLog().equals("replace filter net");

        assert logs.get(1).getMaintenanceStaff().equals("Si Li");
        assert logs.get(1).getMaintenance() == MaintenanceType.BigMaintenance;
        assert logs.get(1).getLog().equals("clean  engine");
    }

    /**
     *
     * Method: getDeviceLog()
     *
     */
    @Test
    public void testGetDeviceLog() throws Exception {
        //TODO: Test goes here...
        Device device1 = new AirConditioner9001("z2101");
        DeviceLog log1 = device1.getDeviceLog();
        assert log1.getDeviceName().equals("AirConditioner");
        assert log1.getDeviceType() == DeviceType.AirConditioner;
        assert log1.getLocation().equals("z2101");
        assert log1.getModel().equals("9001");

        Device device2 = new AirConditioner9002("z2102");
        DeviceLog log2 = device2.getDeviceLog();
        assert log2.getDeviceName().equals("AirConditioner");
        assert log2.getDeviceType() == DeviceType.AirConditioner;
        assert log2.getLocation().equals("z2102");
        assert log2.getModel().equals("9002");

        Device device3 = new Elevator9001("z2103");
        DeviceLog log3 = device3.getDeviceLog();
        assert log3.getDeviceName().equals("Elevator");
        assert log3.getDeviceType() == DeviceType.Elevator;
        assert log3.getLocation().equals("z2103");
        assert log3.getModel().equals("9001");

        Device device4 = new Elevator9002("z2103");
        DeviceLog log4 = device4.getDeviceLog();
        assert log4.getDeviceName().equals("Elevator");
        assert log4.getDeviceType() == DeviceType.Elevator;
        assert log4.getLocation().equals("z2103");
        assert log4.getModel().equals("9002");

        Device device5 = new Pump9001("z2103");
        DeviceLog log5 = device5.getDeviceLog();
        assert log5.getDeviceName().equals("Pump");
        assert log5.getDeviceType() == DeviceType.Pump;
        assert log5.getLocation().equals("z2103");
        assert log5.getModel().equals("9001");

        Device device6 = new Pump9002("z2106");
        DeviceLog log6 = device6.getDeviceLog();
        assert log6.getDeviceName().equals("Pump");
        assert log6.getDeviceType() == DeviceType.Pump;
        assert log6.getLocation().equals("z2106");
        assert log6.getModel().equals("9002");
    }

} 
