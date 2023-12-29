class PrimeCalculator {

    int nth(int nth) {
        int count=0;
        if(nth==0){
            throw new IllegalArgumentException();
        }int number=2;
        while(true){
            int c=0;
           for(int i=2;i<number;i++){
               if(number%i==0){
                   c++;
                   break;
               }
            }
            if(c==0){
                count++;
            }
            if(nth==count){
                break;
            }
            number++;
        }
        return number;
        
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
