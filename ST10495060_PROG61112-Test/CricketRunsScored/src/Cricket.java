public abstract class Cricket implements ICricket {

    private String batsmanName;
    private String stadiumName;
    private int totalRuns;

    // Constructor
    public Cricket(String batsmanName, String stadiumName, int totalRuns) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRuns = totalRuns;
    }

    // Implement interface methods
    @Override
    public String getBatsman() {
        return batsmanName;
    }

    @Override
    public String getStadium() {
        return stadiumName;
    }

    @Override
    public int getRunsScored() {
        return totalRuns;
    }

    // Abstract method for report printing
    public abstract void printReport();
}
