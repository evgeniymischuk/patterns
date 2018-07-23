package flyweight;

public class Fork implements GravityObject {
    @Override
    public void activate() {
        System.out.println("Fork go crazy and went to sun");
    }
}
