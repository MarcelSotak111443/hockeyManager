public class Main {

    public static void main(String[] args) {
        HockeyManager hockeyManager = new HockeyManager();

        hockeyManager.addNewForward("Forward1", 22, 10);
        hockeyManager.addNewForward("Forward2", 24, 8);
        hockeyManager.addNewDefender("Defender1", 26, 50);
        hockeyManager.addNewDefender("Defender2", 1, 70);
        hockeyManager.addNewGoalie("Goalie1", 29, 25);
        hockeyManager.addNewGoalie("Goalie2", 27, 30);

        // Print name and age of the youngest player
        hockeyManager.PrintNameAndAgeOfTheYoungestPlayer();
    }
}
