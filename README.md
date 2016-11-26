# Card-game
The assignment was as follows:

If you examine the main method of the Dealer class you can see that the program executes as follows  (you can follow this in the comments in the main method):

    Input is parsed to get the required number of hands and the number of cards per hands 
    An empty array of Player objects is created. The size is based on the number parsed from step 1
    A new ConcreteDealer object is created
    The newDeck() method of the ConcreteDealer object is called
    The shuffle() method of the ConcreteDealer object is called
    For each Hand required, the deal() method of the Dealer object is called. Each time it is called it returns a new Hand Object
    Each new Hand Object is passed to a Player
    For each Player object in the array of Players, the showHand() method is called. The showHand() method prints out the value of the Cards in the Player object


Your assignment is to make this program work by completing the functionality of the Card, ConcreteDeck, ConcrteDealer and ConcreteHand classes.  You should not have to touch the Interfaces. You will see that I have indicated with comments the basic functionality of each method. It is up to you to implement this functionality. We have covered everything you need to complete this assignment successfully, either in lectures or in the lab assignments

First step: Go through the logic of the programme. Examine the relationships between objects and where an object calls another object. For example, when the shuffle() method of Dealer is called, does the Dealer object actually shuffle the Deck itself or does it call on another object to do this. Is this method implemented? If not, you need to implement it.

Try to figure out the responsibilities of each class. In OOP, every class should have clear responsibilities. For example, the Dealer object has a newDeck() method so it has responsibility for creating new Decks of cards. But which class has responsibility for putting the correct cards into each deck?  In which method is this carried out? These are the sorts of questions that will guide you to implementing the remaining functionality.

This is not an assignment that you should expect to finish in one sitting (though some of you may). You have all the tools you need to make it work - but you may need time to think and figure it out. There is not a lot of code writing required.  Do a little bit everyday. Become familiar with the logic of the code. 
