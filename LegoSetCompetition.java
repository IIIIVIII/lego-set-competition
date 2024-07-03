import java.util.Formatter;
import java.util.Scanner;

/**
 * A simple LegoSetCompetition class
 *
 * @author Purdue CS
 * @version 07/03/2021
 */
public class LegoSetCompetition {
    private int playerNumber;
    private String completeSets;
    private String incompleteSets;
    private int piecesBuilt;
    public int getPlayerNumber(){
        return playerNumber;

    }
    public String getCompleteSets(){
        return completeSets;

    }
    public String getIncompleteSets(){
        return incompleteSets;

    }
    public int getPiecesBuilt(){
        return piecesBuilt;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = "";
        String name2 = "";
        String name3 = "";
        String allNames = "";
        int count1 = 0;
        int count2 = 0;
        int day = 0;
        int total = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int totalCount1 = 0;
        int totalCount2 = 0;
        System.out.println("Welcome to the Lego Set Competition!");
        do {
            System.out.println("Enter the name of Lego Set 1");
            name1 = scanner.nextLine();
            System.out.println("Enter the number of pieces in Lego Set 1");
            num1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the name of Lego Set 2");
            name2 = scanner.nextLine();
            System.out.println("Enter the number of pieces in Lego Set 2");
            num2 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the name of Lego Set 3");
            name3 = scanner.nextLine();
            System.out.println("Enter the number of pieces in Lego Set 3");
            num3 = scanner.nextInt();
            scanner.nextLine();
            total = num1 + num2 + num3;
            count1 = 0;
            count2 = 0;
            do {
                day += 1;
                System.out.printf("Enter the number of pieces player 1 used for building on day %d\n", day);
                int input1 = scanner.nextInt();
                scanner.nextLine();
                count1 += input1;
                System.out.printf("Enter the number of pieces player 2 used for building on day %d\n", day);
                int input2 = scanner.nextInt();
                scanner.nextLine();
                count2 += input2;
            } while (count1 != total && count2 != total);
            if (count1 == total && count2 == total) {
                System.out.println("The competition ended in a tie! There will be a tiebreaker round");
                totalCount1 += count1;
                totalCount2 += count2;
                Formatter formatter = new Formatter();
                allNames = allNames + String.format("%s, %s, %s, ", name1, name2, name3);
            }
//            System.out.println(count1);
//            System.out.println(count2);
        } while (count1 == total && count2 == total);
        if (count1 == total) {
            System.out.println("Congratulations to player 1 for winning the Lego Set Competition!");
            System.out.println("Additional information about the competition results is below");
            System.out.printf("Player 1 completed the following sets: %s%s, %s, %s\n", allNames, name1, name2, name3);
            System.out.println("Player 1 did not complete the following sets: None");
            System.out.println("Player 1 built a total of " + (totalCount1 + count1) + " pieces");
            if (count2 >= num1 && count2 < num1 + num2) {
                System.out.printf("Player 2 completed the following sets: %s%s\n", allNames, name1);
                System.out.printf("Player 2 did not complete the following sets: %s, %s\n", name2, name3);
            } else if (count2 >= num1 + num2) {
                System.out.printf("Player 2 completed the following sets: %s%s, %s\n", allNames, name1, name2);
                System.out.printf("Player 2 did not complete the following sets: %s\n", name3);
            } else {
                if (allNames.isEmpty()) {
                    System.out.println("Player 2 completed the following sets: None");
                }
                //System.out.printf("Player 2 completed the following sets: %s", allNames);
                System.out.print("Player 2 did not complete the ");
                System.out.printf("following sets: %s, %s, %s \n", name1, name2 , name3);
            }
            System.out.println("Player 2 built a total of " + (totalCount2 + count2) + " pieces");
            System.out.println("The competition lasted " + day + " days");
        } else {
            System.out.println("Congratulations to player 2 for winning the Lego Set Competition!");
            System.out.println("Additional information about the competition results is below");
            if (count1 >= num1 && count1 < num1 + num2) {
                int playerNumber = 1;
                String completeSets = name1;
                String incompleteSets = name2 + name3;
                int piecesBuilt = count1;
                System.out.printf("Player 1 completed the following sets: %s%s\n", allNames, name1);
                System.out.printf("Player 1 did not complete the following sets: %s, %s\n", name2, name3);

            } else if (count1 >= num1 + num2) {
                System.out.printf("Player 1 completed the following sets: %s%s, %s\n", allNames, name1, name2);
                System.out.printf("Player 1 did not complete the following sets: %s\n", name3);
            } else {
                if (allNames.isEmpty()) {
                    System.out.println("Player 1 completed the following sets: None");
                }
                System.out.printf("Player 1 completed the following sets: %s", allNames);
                System.out.printf("Player 1 did not complete the following sets: %s%s, %s\n", name1, name2, name3);
            }
            System.out.println("Player 1 built a total of " + (totalCount1 + count1) + " pieces");
            System.out.printf("Player 2 completed the following sets: %s%s, %s, %s\n", allNames, name1, name2, name3);
            System.out.println("Player 2 did not complete the following sets: None");
            System.out.println("Player 2 built a total of " + (totalCount2 + count2) + " pieces");
            System.out.println("The competition lasted " + day + " days");
        }


    }
}

