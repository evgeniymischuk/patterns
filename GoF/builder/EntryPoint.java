package builder;

public class EntryPoint {
    public static void main(String[] args) {
        Fork fork = new ForkBuilderImpl()
                .setColor("red")
                .build();

        System.out.println(fork.getColor());
        System.out.println(fork.getHeight());
        System.out.println(fork.getWeight());
    }
}
