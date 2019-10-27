package builder;

public interface ForkBuilder {
    ForkBuilder setColor(String color);

    ForkBuilder setWeight(double weight);

    ForkBuilder setHeight(double height);

    Fork build();
}
