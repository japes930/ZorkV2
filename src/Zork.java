import java.util.Random;
import java.util.Scanner;

public class Zork {
    private static int roomNum;
    private static int direction;

    public static void main(String[] args) {
        roomNum = 0;
        int roomsVisited = 0;
        boolean secret = false;
        boolean cont = true;
        Scanner keyboard = new Scanner(System.in);
        Random rnd = new Random();
        String direction;


        System.out.println("You're outside the haunted castle type 'Enter' to go in.");
        direction = keyboard.next();
        enterHouse(direction);
        switch (roomNum) {
            case 1:
        }


    }

    public static void enterHouse(String x) {

        if (x.toLowerCase().equals("enter")) {
            int y = 1;
            roomNum = y;
        }
    }

    public static void enterRoom1(String x) {
        System.out.println("You've walked into the foyer. Watch out for the dead scorpion! Type  'North' to enter next room: ");
        System.out.println("Type 'EXIT' to leave the haunted castle");
        direction = keyboard.next();
        if (direction.toLowerCase().equals("north")) {
            roomNum = 2;
            roomsVisited++;
        } else if (direction.toLowerCase().equals("exit")) {
            roomNum = 9;
            roomsVisited++;
        } else {
            System.out.println("You tripped on the scorpion.... try again.");
        }


    }

}
    }
            }
