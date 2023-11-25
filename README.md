# CardGame
This is an app where you can play BlackJack card game with bot. 
# DIRECTORIES
src: This directory contains all the java source files like, CardGame.java, Homepgae.java, cards (where all the images are stored) that are detailed below.
# Classes AND Descriptions
HomePage.java-> This is the first of playing cards app, in this page there is start button which used to start the game.

CardGame.java-> This class is the main class of the game, which have different- different methods like, paintComponent, drawCardSlots etc.

#methods in CardGame.java Class
drawCard()-> This method is used for draw a card when user click on draw button.

shuffleDeck()->This method used to shuffle the deck.

calculatePoints()-> This method calculate the points of player's and opponent's each cards.

updatePoints()->In this method, player and opponents points are updated after each moves of card.

determineRoundWinner()->This method is used for determining the winner of the game. 

HoverMouseListener-> this class is made inside of CardGame.java class,which is used for change the button color after hover on the buttons.

# Additional JAR files
In libraries we have additionally used KGradientPanel.jar file to provide gradient colors to the homepage for making it looks attractive. 
 
