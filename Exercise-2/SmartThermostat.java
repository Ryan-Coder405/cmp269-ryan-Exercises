
public class SmartThermostat extends SmartDevice implements Adjustable{
    private int temperature;

    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    @Override
    public void setLevel(int level) {
        if(isOn == false){
            System.out.println("Cannot adjust: Device is OFF");
        } else {
            //range 60-80
            temperature = level;
            if(temperature > 80){
                temperature = 80;
            } else if (temperature < 60){
                temperature = 60;
            }
        }
        
    }

    @Override
    public void turnOn() {
        System.out.println("HVAC System Starting...");
        //it says to do super.turnOn() but I got errors due to the superclass being an abstract
        //also the SmartDevice class doesn't have a turnOn() method, pasting from SmartLight
        if(isOn == false){
            activeDevicesCount++;
            isOn = true;
        } 
    }

    @Override
    public void turnOff() {
        if(isOn == true){
            activeDevicesCount--;
            isOn = false;
        } 
    }

    @Override
    public void performSelfDiagnostic() {
        System.out.println("Checking Thermostat health...");
    }

    
    
}
