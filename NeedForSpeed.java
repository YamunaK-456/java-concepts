class NeedForSpeed {
    
    int speed;
    int meters=0;
    int battery=100;
    int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;
        this.batteryDrain=batteryDrain;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed constructor");
    }

    public boolean batteryDrained() {
        if(battery>0)
            return false;
        else
            return true;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    }

    public int distanceDriven() {
        return meters;
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
    }

    public void drive() {
        if(battery>0) {
            meters += speed;
            battery -= batteryDrain;
        }
        //throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
        //throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance=distance;
        //throw new UnsupportedOperationException("Please implement the RaceTrack constructor");
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        boolean flag=false;

        double b= car.batteryDrain;
        double s=car.speed;

        double div=distance/s;
        double rem=div*b;

        if(car.battery-rem>=0)
            flag=true;
        return flag;
        //throw new UnsupportedOperationException("Please implement the RaceTrack.tryFinishTrack() method");
    }
}
