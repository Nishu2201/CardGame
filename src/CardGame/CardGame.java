package CardGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.border.EmptyBorder;

public class CardGame {
    private static final int CARD_WIDTH = 110;
    private static final int CARD_HEIGHT = 154;
    private JLabel playerPointsLabel = new JLabel("Player Points: 0");
    private JLabel opponentPointsLabel = new JLabel("Opponent Points: 0");
    private JPanel pointsPanel = new JPanel();
    private JPanel gamePanel = new JPanel() {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            drawCardSlots(g, playerHand, 20);
            drawCardSlots(g, opponentHand, 20 + CARD_HEIGHT + 20);
        }

        private void drawCardSlots(Graphics g, ArrayList<Card> hand, int yOffset) {
            for (int i = 0; i < hand.size(); i++) {
                Card card = hand.get(i);
                Image cardImage = null;
                String imagePath = card.getImagePath();

                if (getClass().getResource(imagePath) != null) {
                    cardImage = new ImageIcon(getClass().getResource(imagePath)).getImage();
                }

                if (cardImage != null) {
                    g.drawImage(cardImage, 20 + i * (CARD_WIDTH + 10), yOffset, CARD_WIDTH, CARD_HEIGHT, null);
                }
            }
        }
    };

    private JPanel buttonPanel = new JPanel();
    private JButton drawButton = createStyledButton("Draw");
    private JButton skipButton = createStyledButton("Skip");
    private JButton continueButton = createStyledButton("Continue");
    private JButton Exit =createStyledButton("Exit");

    private ArrayList<Card> deck;
    private Random random = new Random();

    private ArrayList<Card> playerHand;
    private int playerPoints;

    private ArrayList<Card> opponentHand;
    private int opponentPoints;

    private int roundsPlayed;
    private int playerScore;
    private int opponentScore;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CardGame());
    }

    public CardGame() {
        initializeGame();
        //setupAnimation();
        
        JFrame frame = new JFrame("Card Game");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(pointsPanel, BorderLayout.NORTH);
        frame.add(gamePanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setUndecorated(true);

        // Set background colors
        pointsPanel.setBackground(new Color(15, 14, 10)); // Black
        gamePanel.setBackground(new Color(180, 200, 255)); // Light Blue
        buttonPanel.setBackground(new Color(15,14,10)); // Black

        frame.setVisible(true);

    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(90, 40));
        button.setBackground(new Color(0, 51, 110)); // Dark Blue
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setFont(new Font("Verdana", Font.BOLD, 16));
        button.setBorder(BorderFactory.createLineBorder(new Color(0, 51, 110), 2)); // Darker Blue Border
        button.setMargin(new Insets(20, 25, 20, 25));

        // Add hover effect
        button.addMouseListener(new HoverMouseListener(button));

        return button;
    }

//    void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    private class HoverMouseListener extends MouseAdapter {
        private final JButton button;
        private final Color originalColor;

        public HoverMouseListener(JButton button) {
            this.button = button;
            this.originalColor = button.getBackground();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            button.setBackground(originalColor.brighter());
        }

        @Override
        public void mouseExited(MouseEvent e) {
            button.setBackground(originalColor);
        }
    }

    private void initializeGame() {
        System.out.println("Initializing game...");
        buildDeck();
        shuffleDeck();
        initializeRound();
        setupUI();
        System.out.println("Game initialized successfully.");
    }

    private void initializeRound() {
        System.out.println("Initializing round...");
        playerHand = new ArrayList<>();
        opponentHand = new ArrayList<>();
        playerPoints = 0;
        opponentPoints = 0;
        roundsPlayed++;
        drawInitialCards();
        drawOpponentCard();
         System.out.println("Round initialized successfully.");
    }

    private void drawInitialCards() {
        drawPlayerCard();
    }

    private void drawPlayerCard() {
        if (roundsPlayed > 5) {
            JOptionPane.showMessageDialog(null, "You played for 5 rounds");
            endGame();
            return;
        }
        drawCard(playerHand);
        updatePoints();
        playerPointsLabel.setText("Player Points: " + playerPoints);
        gamePanel.repaint();
        if(roundsPlayed <=5 && playerHand.size() ==5 && opponentHand.size()==5){
            endRound();
        }
    }

    private void drawOpponentCard() {
        if (roundsPlayed > 5) {
            JOptionPane.showMessageDialog(null, "You played for 5 rounds");
            endGame();
            return;
        }
        drawCard(opponentHand);
        updatePoints();
        opponentPointsLabel.setText("Opponent Points: " + opponentPoints);
        gamePanel.repaint();
        if(roundsPlayed <=5 && opponentHand.size() ==5 && playerHand.size()==5){
            endRound();
        }
    }

    private void drawCard(ArrayList<Card> hand) {
        if (deck.isEmpty()) {
            shuffleDeck();
        }
        if (deck != null && !deck.isEmpty()) {
            Card card = deck.remove(deck.size() - 1);
            hand.add(card);

            if (playerPoints > 33 || opponentPoints > 33) {
                endRound();
            }
        }
    }

    private void updatePoints() {
        playerPoints = calculatePoints(playerHand);
        opponentPoints = calculatePoints(opponentHand);
    }

    private int calculatePoints(ArrayList<Card> hand) {
        int points = 0;
        for (Card card : hand) {
            points += card.getPoints();
        }
        return points;
    }

    private void endRound() {
        String message = determineRoundWinner();
        JOptionPane.showMessageDialog(null, message);

        if (playerPoints > opponentPoints) {
           opponentScore++; 
        } else if (opponentPoints > playerPoints) {
            playerScore++;
        }

        int option = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Continue",
                JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            initializeRound();
        } else {
            endGame();
        }
    }

    private String determineRoundWinner() {
        if (playerPoints == 33 && opponentPoints == 33) {
            return "Round is a draw!";
        } else if (playerPoints >= 33 && opponentPoints < 33) {
            return "Opponent wins the round!";
        } else if (opponentPoints >= 33 && playerPoints < 33) {
            return "You win the round!";
        } else if (playerPoints > 33 && opponentPoints > 33) {
            return "Both players lose the round!";
        }
        else if((playerPoints>opponentPoints && playerPoints<33) && opponentPoints<33 ){
            return "Opponent win the round!";
        }
        else if((opponentPoints>playerPoints && opponentPoints<33) && playerPoints<33 ){
            return "You win the round!";
        } else {
            return "Round is a draw!";
        }
    }

    private void endGame() {
        JOptionPane.showMessageDialog(null, "Game Over!\nPlayer Score: " + playerScore +
                "\nOpponent Score: " + opponentScore);
        System.exit(0);
    }

    private void buildDeck() {
        deck = new ArrayList<>();
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] types = {"C", "D", "H", "S"};

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                Card card = new Card(values[j], types[i]);
                deck.add(card);
            }
        }
    }

    private void shuffleDeck() {
        if (deck != null && !deck.isEmpty()) {
            for (int i = 0; i < deck.size(); i++) {
                int j = random.nextInt(deck.size());
                Card currCard = deck.get(i);
                Card randomCard = deck.get(j);
                deck.set(i, randomCard);
                deck.set(j, currCard);
            }
        }
    }

    private void setupUI() {
        pointsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        pointsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        pointsPanel.add(playerPointsLabel);
        pointsPanel.add(opponentPointsLabel);
        
        pointsPanel.setBackground(new Color(255, 204, 153)); // Light Orange

        // Set up player and opponent point labels
        playerPointsLabel.setForeground(Color.WHITE);
        playerPointsLabel.setFont(new Font("Arial", Font.BOLD, 16));

        opponentPointsLabel.setForeground(Color.WHITE);
        opponentPointsLabel.setFont(new Font("Arial", Font.BOLD, 16));

        gamePanel.setLayout(new BorderLayout());
        gamePanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        buttonPanel.add(drawButton);
        buttonPanel.add(skipButton);
        buttonPanel.add(continueButton);
        buttonPanel.add(Exit);
        
        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            endGame();
            }
        });
        
        drawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawPlayerCard();
                drawOpponentCard();
            }
        });

        skipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawOpponentCard();
            }
        });

        continueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (roundsPlayed < 5) {
                    initializeRound();
                } else {
                    endGame();
                }
            }
        });
    }

//    private void setupAnimation() {
//        ImageIcon gifImage = new ImageIcon(getClass().getResource("./cards/cardsimg.gif"));
//        // int headerHeight = pointsPanel.getPreferredSize().height; // Get the height of the header
//        // Image scaledImage = gifImage.getImage().getScaledInstance(-1, headerHeight, Image.SCALE_DEFAULT); // Adjust the size to match the header height
//        // ImageIcon scaledIcon = new ImageIcon(scaledImage);
//
//        // JLabel headerImageLabel = new JLabel(scaledIcon);
//        // pointsPanel.add(headerImageLabel);
//
//        Image scaledImage = gifImage.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT); // Adjust the size as needed
//        ImageIcon scaledIcon = new ImageIcon(scaledImage);
//
//        JLabel headerImageLabel = new JLabel(scaledIcon);
//
//        // Adjust the position as needed
//        headerImageLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
//        
//        pointsPanel.add(headerImageLabel,0);
//    }

    private class Card {
        String value;
        String type;

        Card(String value, String type) {
            this.value = value;
            this.type = type;
        }

        public String toString() {
            return value + "-" + type;
        }

        public int getPoints() {
            if ("J".equals(value)) {
                return 11;
            } else if ("Q".equals(value)) {
                return 12;
            } else if ("K".equals(value)) {
                return 13;
            } else if ("A".equals(value)) {
                return 1;
            } else {
                return Integer.parseInt(value);
            }
        }

        public String getImagePath() {
        return "../cards/" + toString() + ".png";
        }
    }
}
