public class CricketRunsScored extends Cricket {

    public CricketRunsScored(String batsmanName, String stadiumName, int totalRuns) {
        super(batsmanName, stadiumName, totalRuns);
    }

    @Override
    public void printReport() {
        System.out.println("\nBATSMAN RUNS SCORED REPORT");
        System.out.println("***************************");
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}
