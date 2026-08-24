import java.util.Scanner;

public class RockPaperScissors {
    
    // Method to get computer choice
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }
    
    // Method to find winner
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        
        if (userChoice.equals("rock")) {
            if (computerChoice.equals("scissors")) return "User";
            else return "Computer";
        } else if (userChoice.equals("paper")) {
            if (computerChoice.equals("rock")) return "User";
            else return "Computer";
        } else {
            if (computerChoice.equals("paper")) return "User";
            else return "Computer";
        }
    }
    
    // Method to calculate win percentage
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int total) {
        String[][] stats = new String[3][2];
        
        stats[0][0] = "User";
        stats[0][1] = String.format("%.2f%%", (userWins * 100.0 / total));
        
        stats[1][0] = "Computer";
        stats[1][1] = String.format("%.2f%%", (computerWins * 100.0 / total));
        
        stats[2][0] = "Draws";
        stats[2][1] = String.format("%.2f%%", (draws * 100.0 / total));
        
        return stats;
    }
    
    // Method to display results
    public static void displayResults(String[] userChoices, String[] computerChoices, 
                                     String[] winners, String[][] stats) {
        System.out.println("\n=== Game Results ===");
        System.out.printf("%-10s %-15s %-15s %-10s%n", "Game", "User", "Computer", "Winner");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < userChoices.length; i++) {
            System.out.printf("%-10s %-15s %-15s %-10s%n", 
                "Game " + (i + 1), userChoices[i], computerChoices[i], winners[i]);
        }
        
        System.out.println("\n=== Win Statistics ===");
        System.out.printf("%-15s %-10s%n", "Player", "Win %");
        System.out.println("---------------------");
        
        for (int i = 0; i < stats.length; i++) {
            System.out.printf("%-15s %-10s%n", stats[i][0], stats[i][1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of games: ");
        int n = scanner.nextInt();
        
        String[] userChoices = new String[n];
        String[] computerChoices = new String[n];
        String[] winners = new String[n];
        
        int userWins = 0, computerWins = 0, draws = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter rock/paper/scissors: ");
            userChoices[i] = scanner.next().toLowerCase();
            
            computerChoices[i] = getComputerChoice();
            winners[i] = findWinner(userChoices[i], computerChoices[i]);
            
            if (winners[i].equals("User")) userWins++;
            else if (winners[i].equals("Computer")) computerWins++;
            else draws++;
        }
        
        // Calculate stats
        String[][] stats = calculateStats(userWins, computerWins, draws, n);
        
        // Display results
        displayResults(userChoices, computerChoices, winners, stats);
        
        scanner.close();
    }
}