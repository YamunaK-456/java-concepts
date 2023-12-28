
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
    }

    public int getToday() {
        int len=birdsPerDay.length;
        int todayBirds=birdsPerDay[len-1];
        return todayBirds;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
    }

    public void incrementTodaysCount() {
        int len=birdsPerDay.length;
        birdsPerDay[len-1]=getToday()+1;
        
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        for(Integer i:birdsPerDay){
            if (i==0){
                return true;
            }
        }
        return false;
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        if(numberOfDays>birdsPerDay.length)
            numberOfDays=birdsPerDay.length;
        int birdsVisited=0;
        for(int i=0;i<numberOfDays;i++){
            birdsVisited+=birdsPerDay[i];
        }
        return birdsVisited;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int busyDays=0;
        for(Integer i:birdsPerDay){
            if(i>=5){
                busyDays++;
            }
        }
        return busyDays;
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
