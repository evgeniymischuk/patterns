package stringVsBuffer;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("string");
        sb.append("string");
        sb.append("string");
        sb.append("string");
        sb.append("string");
        sb.append("string");
        sb.append("string");
        sb.append("string");

        long usedBytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println(usedBytes + " bytes");
    }
}