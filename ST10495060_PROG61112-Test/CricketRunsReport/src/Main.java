class CricketReport {

    // To add up runs for each row or column
    private static int sumArray(int[] row) {
        int total = 0;
        for (int value : row) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {

        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};
        String[] batsmen  = {"Jacques Kallis", "Hashim Amla", "AB De Villiers"};

        // runs for stadium and batsman
        int[][] runs = {
                {5000, 3800, 4200},
                {3500, 3700, 3900},
                {6200, 5000, 5200}
        };

        // table with an extra row and column for totals
        int[][] table = new int[stadiums.length + 1][batsmen.length + 1];

        // copy runs and fill totals in one go
        for (int i = 0; i < stadiums.length; i++) {
            for (int j = 0; j < batsmen.length; j++) {
                table[i][j] = runs[i][j];
                table[i][batsmen.length] += runs[i][j]; // row total
                table[stadiums.length][j] += runs[i][j]; // column total
            }
        }

        // to print header
        System.out.printf("%-12s", "Stadium");
        for (String b : batsmen) System.out.printf("%-18s", b);
        System.out.printf("%-10s%n", "Total");

        // to print stadium rows
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-12s", stadiums[i]);
            for (int j = 0; j < batsmen.length; j++) {
                System.out.printf("%-18d", table[i][j]);
            }
            System.out.printf("%-10d%n", table[i][batsmen.length]);
        }

        // to print batsman totals
        System.out.println("\nRuns per batsman:");
        for (int j = 0; j < batsmen.length; j++) {
            System.out.printf("%-18s : %d%n", batsmen[j], table[stadiums.length][j]);
        }

        // to find stadium with maximum total
        int maxIndex = 0;
        for (int i = 1; i < stadiums.length; i++) {
            if (table[i][batsmen.length] > table[maxIndex][batsmen.length]) {
                maxIndex = i;
            }
        }
        System.out.println("\nHighest total runs stadium: "
                + stadiums[maxIndex] + " (" + table[maxIndex][batsmen.length] + ")");
    }
}
