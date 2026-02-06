
public class SmartLight extends SmartDevice implements Adjustable {
    private int brightness; //(0-100)

    public SmartLight(String deviceName) {
        super(deviceName);
    }

    @Override
    public void setLevel(int level) {
        if(isOn == false){
            System.out.println("Cannot adjust: Device is OFF");
        } else {
            brightness = level;
            //the brightness cannot exceed 100 nor can it go below 0
            if(brightness > 100){
                brightness = 100;
            } else if (brightness < 0){
                brightness = 0;
            }
        }
    }

    @Override
    public void turnOn() {
        //this if statement is to prevent the method from working if the device is already off
        //if device isn't on, turn it on
        if(isOn == false){
            activeDevicesCount++;
            isOn = true;
        } 
        
    }

    @Override
    public void turnOff() {
        //this if statement is to prevent the method from working if the device is already off
        //if device is on, turn it off
        if(isOn == true){
            activeDevicesCount--;
            isOn = false;
        } 
        
    }

    @Override
    public void performSelfDiagnostic() {
        System.out.println("Checking LED health...");
    }

    
    
}
