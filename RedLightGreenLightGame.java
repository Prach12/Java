/*
In the RED LIGHT, Green Light game, a player must stop when the doll says Red Light and can move only when it says green light. GIven a list of player movements ('1'for Light, 0 for Standing still ) and a sequense of commands('R'for Red Light, 'G'for greenlight), find out if any player gets eliminated,
player Moves: [1,0,1,1,0]
commands:"GRRGG"
output:
Player 1: Safe
Player 2: Safe
Player 3: eliminated
Player 4: Safe
player 5: Safe
*/
public class RedLightGreenLightGame {
    public static void main(String[] args) {
        int[] playerMoves = {1, 0, 1, 1, 0};
        String commands = "GRRGG";

        for (int i = 0; i < playerMoves.length; i++) {
            char command = commands.charAt(i);
            int move = playerMoves[i];

            if (command == 'R' && move == 1) {
                System.out.println("Player " + (i + 1) + ": eliminated");
            } else {
                System.out.println("Player " + (i + 1) + ": Safe");
            }
        }
    }
}
