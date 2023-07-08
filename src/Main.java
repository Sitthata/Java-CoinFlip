public class Main {
    public static void main(String[] args) {
        int numberOfFlips = 1000000;
        int consecutiveFlipsToFind = 5;
        double probability = calculateProbability(numberOfFlips, consecutiveFlipsToFind);
        int consecutiveCount = countConsecutiveFlips(numberOfFlips, consecutiveFlipsToFind);
        System.out.println("We found " + consecutiveCount + " consecutive flips of " + consecutiveFlipsToFind + " in " + numberOfFlips + " flips.");
        System.out.println("The probability of finding " + consecutiveFlipsToFind + " consecutive flips in " + numberOfFlips + " flips is " + probability);
    }

    public static String flipCoin() {
        return Math.random() < 0.5 ? "heads" : "tails";
    }

    public static int countConsecutiveFlips(int numberOfFlips, int consecutiveFlipsToFind) {
        int count = 0;
        int totalCount = 0;
        String lastFlip = null;

        // Flip the coin for n times
        for (int i = 0; i < numberOfFlips; i++) {
            String currentFlip = flipCoin();
            // Keep track of consecutive flips
            if (currentFlip.equals(lastFlip)) {
                count++;
                // Reset counter if we found the number of consecutive flips we are looking for
                if (count == consecutiveFlipsToFind) {
                    totalCount++;
                    count = 0;
                }
            } else {
                // Go ahead
                count = 1;
            }
            // Keep track of last flip
            lastFlip = currentFlip;
        }
        return totalCount;
    }

    public static double calculateProbability(int numberOfFlips, int consecutiveFlipsToFind) {
        int consecutiveCount = countConsecutiveFlips(numberOfFlips, consecutiveFlipsToFind);
        return (double) consecutiveCount / numberOfFlips;
    }


}