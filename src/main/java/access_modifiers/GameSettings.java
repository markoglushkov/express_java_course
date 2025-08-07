package access_modifiers;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int value) {
        maxPlayers = value;
    }

    public void addPlayer() {
        if (currentPlayers + 1 > maxPlayers) {
            System.out.println("You cannot add a player");
        } else {
            currentPlayers += 1;
        }
    }

    public void printGameStatus() {
        System.out.println("Game name: " + gameName + "\nCurrent Players: " + currentPlayers + "\nMax players: " + maxPlayers);
    }

}
