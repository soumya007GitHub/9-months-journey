public class Pattern1{
    public static void main(String[] args){
        // Outer loop - 4 - no of rows
        for(int i = 1; i<=4; ++i){
            // inner loop - inside rows
            for(int j = 1; j<=i; ++j){
                System.out.print("*");
            }
            // Next Line
            System.out.println();
        }
    }
}