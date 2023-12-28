public class ElonsToyCar {
    private int meters=0;
    private int battery=100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
        //throw new UnsupportedOperationException("Please implement the (static) RemoteControlCar.buy()  method");
    }

    public String distanceDisplay() {
        
        return "Driven "+meters+" meters";
        //throw new UnsupportedOperationException("Please implement the RemoteControlCar.distanceDisplay()  method");
    }

    public String batteryDisplay() {
        if(battery==0){
            return "Battery empty";
        }
        return "Battery at "+battery+"%";
        //throw new UnsupportedOperationException("Please implement the RemoteControlCar.batteryDisplay()  method");
    }

    public void drive() {
        if(battery!=0){
            meters+=20;
            battery-=1; 
        }
        
        
        //throw new UnsupportedOperationException("Please implement the RemoteControlCar.drive()  method");
    }
}
