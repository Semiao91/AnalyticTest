public class HorizontalThread {
    private String left;
    private String right;
    public HorizontalThread(){
        this.left = "left";
        this.right = "right";
    }

    public String moveRight(){
        return this.right;
    }

    public String moveLeft(){
        return this.left;
    }
}
