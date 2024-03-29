package basics;

import java.util.*;

public class BowlingGame {
    Map<String, Integer> players;

    BowlingGame() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //your code goes here
    public void getWinner() {
        int max = Collections.max(players.values());
//        System.out.println(max);
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue()==max) {
                keys.add(entry.getKey());
                System.out.println(entry.getKey());
            }
        }

    }
}
class Programa {
    public static void main(String[ ] args) {
        BowlingGame game = new BowlingGame();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
