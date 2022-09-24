package basics;

enum Difficulty{
    EASY,
    MEDIUM,
    HARD
}

class BulletPlayer{

    public BulletPlayer(Difficulty diff) {
        switch(diff){
            case EASY:
                System.out.println("You have 3000 bullets");
                break;

            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;

            case HARD:
                System.out.println("You have 1000 bullets");
        }
    }
}

public class Bullets {
    public static void main(String[] args) {
        BulletPlayer player1 = new BulletPlayer(Difficulty.EASY);
        BulletPlayer player2 = new BulletPlayer(Difficulty.MEDIUM);
        BulletPlayer player3 = new BulletPlayer(Difficulty.HARD);
    }
}
