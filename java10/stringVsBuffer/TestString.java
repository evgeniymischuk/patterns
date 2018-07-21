package stringVsBuffer;

public class TestString {
    public static void main(String[] args) {
        String s = "string" + "string" + "string" + "string" + "string" + "string" + "string" + "string";

        long usedBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println(usedBytes + " bytes");
    }
}