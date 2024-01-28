public class MethScope {
    
    public static void main(String[] args) {
        {
            int blockValue = 20;
        }

        // System.out.println(blockValue); // Error: blockValue is not defined in this scope
        
    }
}
