import java.util.Random;

public class UsualPlayer extends Player {

    @Override
    public void generateNumber() {
        Random random = new Random();
        this.number = random.nextInt(60);
    }
}
