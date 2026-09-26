package Sort;

class TimeCalculator {
    private long startTime;
    private long endTime;

    
    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }


    public double getElapsedTimeMs() {
        return (endTime - startTime) / 1_000_000.0;
    }
}
