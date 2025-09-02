public class Pattern2 {
    public static void main(String[] args){
        // Outer loop - no of rows
        for(int i = 1; i<=4; ++i){
            // Inside row some space before star
            for(int j = 1; j<=(4-i); ++j){
                System.out.print(" ");
            }
            // Inside row star
            for(int j = 1; j<=i; ++j){
                System.out.print("*");
            }
            // Next Line
            System.out.println();
        }
    }
}
