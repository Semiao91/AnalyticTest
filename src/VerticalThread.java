public class VerticalThread {
    private String up;
    private String down;

    public VerticalThread(){
        this.up = "up";
        this.down = "down";
    }

    public String moveUp(){
        return  this.up;
    }

    public String moveDown(){
        return  this.down;
    }
}
