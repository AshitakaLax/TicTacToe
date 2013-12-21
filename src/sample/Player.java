package sample;

/**
 * Created by jensbaby on 12/21/13.
 */
public class Player {

    private int score;
    private String name;

    public Player()
    {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{}";
    }
}
