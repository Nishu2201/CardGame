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
To use KGradientPanel in the application import the KGradientPanel in the library file.

# Setup steps to run this game.
Step 1:- Download this repository code and import into Netbeans IDE.

Step 2:- Add the dependencies/libraries such as we have additionally use KGradientPanel. Firstly go the Library section present in CardGame project then click on the library folder and then on the library and there is a menu named Add JAR file/ Folder then select the path of KGradientPanel and import it.

Step 3:- The src folder contains the main java files named as HomePage.java and CardGame.java.

Step 4:- Just click on the Run project button or press F6 button to run this game.

# How to play the Game
when the game run then you will first have the Home page screen of the game where you can find the Start button.

On clicking the start button you will be redirected to the main page of game app. 

There you can find 4 buttons named as DRAW, SKIP, CONTINUE and EXIT.

On clicking  DRAW button you can draw the card and the opponent's card is automatically draw after your click.

On clicking SKIP button you can skip your card but the opponent's card is drawed automatically.

On clicking CONTINUE button you can skip the rounds of game and continue with the next round. But you can click on CONTINUE button 5 times only as there is limit of 5 Rounds given at a time.

On clicking EXIT button you will be displayed the current score of game and then on clicking OK button you will exit the game.

NOTE:- There is 5 rounds given at a time to the player.

The player and Opponent score is calculated on the basis of value of the cards in 5 draw.

The player who will have score more than 33 will lose the game and if the both player's score is equal to 33 then the game is draw.

If both the player's have score less than 33 in 5 rounds then the player having score closest to 33 will lose the game.


 
