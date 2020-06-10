package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private int score;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    //Throws
    public int getScore(String playerFile) throws FileNotFoundException {
        Scanner contents = new Scanner(new File(playerFile));
        return Integer.parseInt(contents.nextLine());
    }

    //Finally
    public int getScoreAndCloseScanner(String playerFile) {
        Scanner contents = null;
        try {
            contents = new Scanner(new File(playerFile));
            return Integer.parseInt(contents.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found, resetting score.");
            return 0;
        } finally {
            if (contents != null) {
                contents.close();
            }
        }
    }

    //Simple try-with-resources
    public int getScoreWithTryWithResources(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile))) {
            return Integer.parseInt(contents.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("File not found, resetting score.");
            return 0;
        }
    }

    //Multiple + union catch blocks
    public int getScoreWithMultipleCatch(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile))) {
            return Integer.parseInt(contents.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("Player file not found!" + e);
            return 0;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Player file wouldn't load!" + e);
            return 0;
        }
    }

    //Rethrowing
    public String getName(String playerFile) {
        Scanner contents = null;
        try {
            contents = new Scanner(new File(playerFile));
            return contents.nextLine();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File not Found");
        }
    }

    public String getNameWithoutThrowing(String playerFile) {
        Scanner contents = null;
        try {
            contents = new Scanner(new File(playerFile));
            return contents.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found, the name is empty");
            return "";
        }
    }

    //Wrap + rethrow
    public List<Player> loadAllPlayers(String playersFile) throws PlayerLoadException {
        List<Player> playerList = new ArrayList<>();
        try {
            Scanner playerNames = new Scanner(new File(playersFile));
            while (playerNames.hasNext()) {
                playerList.add(new Player(playerNames.next()));
            }
            return playerList;
        } catch (IOException io) {
            throw new PlayerLoadException(io);
        }
    }

    private class PlayerLoadException extends Exception {
        public PlayerLoadException(Exception e) {

        }
    }
}
