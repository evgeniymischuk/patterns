package builder;

public class ForkBuilderImpl implements ForkBuilder {
    private Fork fork = new Fork();

    @Override
    public ForkBuilder setColor(String color) {
        fork.setColor(color);
        return this;
    }

    @Override
    public ForkBuilder setWeight(double weight) {
        fork.setWeight(weight);
        return this;
    }

    @Override
    public ForkBuilder setHeight(double height) {
        fork.setHeight(height);
        return this;
    }

    @Override
    public Fork build() {
        return fork;
    }
}
