public class Human implements Action {

    int distance;
    int height;

    public Human(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }

    public void run(int distance){
        System.out.println("Human is running");
    }

    public void jump(int height){
        System.out.println("Human is jumping");
    }

}
