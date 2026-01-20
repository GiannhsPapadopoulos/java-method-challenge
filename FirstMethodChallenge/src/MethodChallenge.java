
public class MethodChallenge {

    public static void main(String[] args) {
        String playerName = "John Papadopoulos";
        int playerScore = 990;

        int highScorePosition = calculateHighScorePosition(playerScore);
        displayHighScorePosition(playerName, highScorePosition);

        highScorePosition = calculateHighScorePosition(999);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Kostas", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("James", highScorePosition);



    }

    // Methods
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the highscore list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        }
        else if (playerScore >= 500) {
            position = 2;
        }
        else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}