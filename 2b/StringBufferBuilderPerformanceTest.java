package JavaCollection;

public class StringBufferBuilderPerformanceTest {

    public static void main(String[] args) {
        int iterations = 10_000;
        String appendString = "AIET";

        // Test StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendString);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendString);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Print results
        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000.0 + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000.0 + " ms");

        // Justification
        System.out.println("\nJustification:");
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer because it is not synchronized.");
        } else if (durationBuffer < durationBuilder) {
            System.out.println("StringBuffer is faster in this run, which is unusual since it is synchronized.");
        } else {
            System.out.println("Both took approximately the same time.");
        }
    }
}

