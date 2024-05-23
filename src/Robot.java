import java.util.ArrayList;

public class Robot {
    private VerticalThread verticalThread;
    private HorizontalThread horizontalThread;
    private ArrayList<String> moves;
    public Robot() {
        this.verticalThread = new VerticalThread();
        this.horizontalThread = new HorizontalThread();
        this.moves = new ArrayList<>();
    }

    public ArrayList<String> move() {
        moves.add(verticalThread.moveUp());
        moves.add(verticalThread.moveUp());
        moves.add(horizontalThread.moveRight());
        moves.add(verticalThread.moveDown());
        moves.add(horizontalThread.moveLeft());
        return moves;
    }


}
