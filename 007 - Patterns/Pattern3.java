public class Pattern3 {
    public static void main(String[] args) {
        // Outer loop - no of rows
       for(int i = 1; i<=4; ++i){
        // Inner row - spaces before star
        for(int j = 1; j<=(4-i); ++j){
            System.out.print(" ");
        }
        // Inner row - star with space
        for(int j = 1; j<=i; ++j){
            System.out.print("* ");
        }
        // Next Line
        System.out.println();
       }
    }
}
