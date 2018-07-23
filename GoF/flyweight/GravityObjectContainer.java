package flyweight;

import java.util.TreeMap;

public class GravityObjectContainer {
    private TreeMap<String, GravityObject> container = new TreeMap<>();
    private int invokes;

    public GravityObject getGravityObjectByName(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        GravityObject gravityObject = container.get(name);
        if (gravityObject == null) {
            switch (name) {
                case "knife":
                    gravityObject = new Knife();
                    break;
                case "fork":
                    gravityObject = new Fork();
                    break;
                case "spoon":
                    gravityObject = new Spoon();
                    break;
                default:
                    break;
            }
            container.put(name, gravityObject);
        }
        invokes++;
        return gravityObject;
    }

    public void activateGravityObjectByName(String name) {
        GravityObject gravityObject = getGravityObjectByName(name);
        if (gravityObject != null) {
            gravityObject.activate();
        }
    }

    void printState() {
        System.out.println(String.format("container size %d invokes %d", container.size(), invokes));
    }
}
