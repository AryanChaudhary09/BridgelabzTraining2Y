import java.util.Scanner;

public class DeckOfCards {
    
    // Method to initialize deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        
        return deck;
    }
    
    // Method to shuffle deck
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            
            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }
    
    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int nCards, int xPlayers) {
        if (nCards > deck.length) {
            System.out.println("Not enough cards in deck!");
            return null;
        }
        
        int cardsPerPlayer = nCards / xPlayers;
        String[][] players = new String[xPlayers][cardsPerPlayer];
        
        int cardIndex = 0;
        for (int i = 0; i < xPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        
        return players;
    }
    
    // Method to print players and cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                         "Jack", "Queen", "King", "Ace"};
        
        // Initialize deck
        String[] deck = initializeDeck(suits, ranks);
        
        // Shuffle deck
        deck = shuffleDeck(deck);
        
        System.out.print("Enter number of cards to distribute: ");
        int nCards = scanner.nextInt();
        
        System.out.print("Enter number of players: ");
        int xPlayers = scanner.nextInt();
        
        // Distribute cards
        String[][] players = distributeCards(deck, nCards, xPlayers);
        
        // Print players and cards
        if (players != null) {
            printPlayers(players);
        }
        
        scanner.close();
    }
}