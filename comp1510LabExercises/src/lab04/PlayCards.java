package lab04;
/**
 * a Demo to use enum.
 * @author Haihua (Ryan), Tan
 * @version 1.0
 * */
public class PlayCards {
    /**
     * enum variable enumerates all cards in deck. 
     * */
    enum Rank { 
        /**First card in a deck. */
        ace, 
        /**Second card. */
        two,
        /**Third card. */
        three,
        /**Fourth card. */
        four,
        /**Fifth card. */
        five,
        /**Sixth card. */
        six,
        /**Seventh card. */
        seven,
        /**Eighth card. */
        eight,
        /**Ninth card. */
        nine,
        /**Tenth card. */
        ten,
        /**face card jack. */
        jack,
        /**Face card queen. */
        queen, 
        /**Face card king. */
        king
                }
    /**
     * Main entry of the program.
     * @param args is unused.
     * */
    public static void main(String[] args) {
        Rank highCard = Rank.ace;
        Rank faceCard = Rank.king;
        Rank card1 = Rank.seven;
        Rank card2 = Rank.ten;
        
        //print the highCard and faceCard
        System.out.println("A blackjack hand: " 
                + highCard 
                + " and " 
                + faceCard);
        
        
        int card1Val;
        int card2Val;
        card1Val = card1.ordinal() + 1;
        card2Val = card2.ordinal() + 1;
        
        System.out.println("A two card hand: " + card1 + ", " + card2);
        System.out.println("Hand value: " + (card1Val + card2Val));   
    }
}
