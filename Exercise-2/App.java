import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        ArrayList<SmartDevice> homeHub = new ArrayList<SmartDevice>();
        SmartLight livingRoomLight = new SmartLight("Living Room");
        SmartLight kitchenLight = new SmartLight("Kitchen");
        SmartThermostat hallwayThermo = new SmartThermostat("Hallway");
        homeHub.add(livingRoomLight);
        homeHub.add(kitchenLight);
        homeHub.add(hallwayThermo);

        livingRoomLight.turnOn();
        hallwayThermo.turnOn();
        kitchenLight.setLevel(75);
        System.out.println("Total Active Devices: " + SmartDevice.activeDevicesCount);

        for(int i = 0; i < homeHub.size(); i++){
            homeHub.get(i).performSelfDiagnostic();
        }

    }
    
}
