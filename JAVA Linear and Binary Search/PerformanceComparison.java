public class PerformanceComparison {
    
    public static void main(String[] args) {
        int n = 1000000;
        
        // StringBuffer performance
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();
        
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        
        // StringBuilder performance
        StringBuilder sb2 = new StringBuilder();
        startTime = System.nanoTime();
        
        for (int i = 0; i < n; i++) {
            sb2.append("hello");
        }
        
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        
        System.out.println("StringBuffer time: " + stringBufferTime + " ns");
        System.out.println("StringBuilder time: " + stringBuilderTime + " ns");
        System.out.println("StringBuilder is " + (stringBufferTime / (double)stringBuilderTime) + "x faster");
    }
}