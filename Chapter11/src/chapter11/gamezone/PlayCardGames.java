package chapter11.gamezone;

/**
 *
 * @author Gerardo A A
 */
public class PlayCardGames {
    public static void playCardGames(){
        Poker poker = new Poker();
        Bridge bridge = new Bridge();
        System.out.println("POKER:");
        poker.displayDescription();
        poker.deal();
        System.out.println("BRIDGE:");
        bridge.displayDescription();
        bridge.deal();
    }
}
