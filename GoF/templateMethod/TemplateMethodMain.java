package templateMethod;

public class TemplateMethodMain {
    public static void main(String[] args) {
        GravityStation fork = new ForkStation();
        fork.templateMethod();

        GravityStation knife = new KnifeStation();
        knife.templateMethod();
    }
}
