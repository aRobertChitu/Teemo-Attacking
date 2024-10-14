public class Main {
    public static void main(String[] args) {

    }

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalDuration = 0;
        if(timeSeries.length == 1){
            return  duration;
        }
        for(int i = 0;  i< timeSeries.length-1; i++){
            if(timeSeries[i] + duration > timeSeries[i+1]){
                totalDuration += timeSeries[i+1] - timeSeries[i];
            }else{
                totalDuration += duration;
            }
        }
        return totalDuration + duration;
    }

}

